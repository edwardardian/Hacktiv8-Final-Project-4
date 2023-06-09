package com.example.busreservationapp;

import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.ArrayList;


public class BusDetailActivity extends AppCompatActivity {
    private String TAG = BusDetailActivity.class.getSimpleName();
    private String[] selectedSeats;
    private FrameLayout container;
    private LinearLayout linearLayout;

    private final FragmentBusDetail fragmentBusDetail = new FragmentBusDetail();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_detail);

        Intent intent = getIntent();
        if (intent != null) {
            selectedSeats = getIntent().getStringArrayExtra(FragmentSeatChooserMenu.EXTRA_SELECTED_SEATS);
        }

        if (selectedSeats != null) {
            for (String seat : selectedSeats) {
                Log.d(TAG, "Selected Seat: " + seat);
            }
        }

        initView();

        loadFragment(fragmentBusDetail, selectedSeats);

    }

    private void initView(){
        container = findViewById(R.id.container);
    }

    private void loadFragment(Fragment fragment, String[] selectedSeats) {
        if (fragment instanceof FragmentBusDetail) {
            ArrayList<String> selectedSeatsList = new ArrayList<>();
            if (selectedSeats != null) {
                for (String seat : selectedSeats) {
                    selectedSeatsList.add(seat);
                }
            }
            ((FragmentBusDetail) fragment).setSelectedSeats(selectedSeatsList);
        }

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment);
        fragmentTransaction.commit();
    }
}
