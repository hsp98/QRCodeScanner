package com.example.android.qrcodescanner;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface DataApi {

    @POST("scanQRCode.php")
    Call<Data> getResponse(@Query("bookingId") String bookingId);
}
