package com.example.android.qrcodescanner;

public class Data {

    private String bookingId;

    private String response;

    public Data(String bookingId, String response) {
        this.bookingId = bookingId;
        this.response = response;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getResponse() {
        return response;
    }
}
