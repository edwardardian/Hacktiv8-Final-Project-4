package com.example.busreservationapp;

import java.util.ArrayList;

public class Trip {

    String busName, asal, tujuan, harga, waktu, departureTerminal, arrivalTerminal, timeDeparture, timeArrival, passengers, date, tripId;

    int bookingNumber;

    ArrayList<String> selectedSeats;

    private BusRating rating;

    private boolean rated;

    public Trip() {

    }

    public Trip(String busName, String asal, String tujuan, String harga, String departureTerminal, String arrivalTerminal, String timeDeparture, String timeArrival, String waktu, String passengers, String date, ArrayList<String> selectedSeats) {
        this.busName = busName;
        this.asal = asal;
        this.tujuan = tujuan;
        this.harga = harga;
        this.departureTerminal = departureTerminal;
        this.arrivalTerminal = arrivalTerminal;
        this.timeDeparture = timeDeparture;
        this.timeArrival = timeArrival;
        this.waktu = waktu;
        this.passengers = passengers;
        this.date = date;
        this.selectedSeats = selectedSeats;
        this.rated = false;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getDepartureTerminal() {
        return departureTerminal;
    }

    public void setDepartureTerminal(String departTerminal) {
        this.departureTerminal = departTerminal;
    }

    public String getArrivalTerminal() {
        return arrivalTerminal;
    }

    public void setArrivalTerminal(String arrivalTerminal) {
        this.arrivalTerminal = arrivalTerminal;
    }

    public String getTimeDeparture() {
        return timeDeparture;
    }

    public void setTimeDeparture(String timeDeparture) {
        this.timeDeparture = timeDeparture;
    }

    public String getTimeArrival() {
        return timeArrival;
    }

    public void setTimeArrival(String timeArrival) {
        this.timeArrival = timeArrival;
    }

    public String getPassengers() {
        return passengers;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<String> getSelectedSeats() {
        return selectedSeats;
    }

    public void setSelectedSeats(ArrayList<String> selectedSeats) {
        this.selectedSeats = selectedSeats;
    }

    public int getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(int bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public boolean isRated() {
        return rated;
    }

    public void setRated(boolean rated) {
        this.rated = rated;
    }
}
