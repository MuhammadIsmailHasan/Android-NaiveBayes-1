package com.mind.loginregisterapps;

import com.mind.loginregisterapps.API.*;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;


public interface MainInterface {
    @POST("api/naive")
    Call<ResponseApi> postNb (@Body BodyApi bodyApi);
}
