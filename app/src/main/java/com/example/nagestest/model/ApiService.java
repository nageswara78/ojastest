package com.example.nagestest.model;

import com.example.nagestest.model.pojo.ResponseData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("users")
    Call<ResponseData> getListResponseData(@Query( "offset")String offset, @Query("limit")String linit);
}
