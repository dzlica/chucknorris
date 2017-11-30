package com.greenfox.lica.chucknorris;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by lica on 2017. 11. 30..
 */

public interface ChuckApi {
    final String BASE_URL = "http://api.icndb.com/";

    @GET("jokes/random")
    Call<Chuck> getChuck();

}
