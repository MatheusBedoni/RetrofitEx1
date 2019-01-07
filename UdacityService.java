package com.app.redes.retrofitex1;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Matt on 05/01/2019.
 */

public interface UdacityService {
    public static final String BASE_URL = "https://www.udacity.com/public-api/v0/";

    @GET("courses")
    Call<UdacityCatalog> listCatalog();
}
