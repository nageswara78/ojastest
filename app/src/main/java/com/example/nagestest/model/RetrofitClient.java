package com.example.nagestest.model;

import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    static String BaseUrl="https://sd2-hiring.herokuapp.com/api/";
    static Retrofit retrofit;
    static RetrofitClient retrofitClient;
    Context context;

    private RetrofitClient(Context context) {
        this.context = context;
    }


    public static RetrofitClient getInstance(Context context) {
        if (retrofitClient == null) {
            retrofitClient = new RetrofitClient(context);
        }
        return retrofitClient;
    }
    public  Retrofit getRetrofit(){
       if(retrofit==null){
           retrofit=new Retrofit.Builder().baseUrl(BaseUrl).addConverterFactory(GsonConverterFactory.create()).build();
       }
       return retrofit;
    }

    public ApiService getApiService(){
       return getRetrofit().create(ApiService.class);
    }


}
