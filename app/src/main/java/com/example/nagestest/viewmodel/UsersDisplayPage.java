package com.example.nagestest.viewmodel;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.nagestest.model.RetrofitClient;
import com.example.nagestest.model.pojo.ResponseData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UsersDisplayPage extends ViewModel {
   MutableLiveData<ResponseData> responseDataMutableLiveData ;

    public MutableLiveData<ResponseData> getResponseDataMutableLiveData(Context context,String offset,String limit) {
        responseDataMutableLiveData= new MutableLiveData<>();

        Call<ResponseData> responseDataCall = RetrofitClient.getInstance(context).getApiService().getListResponseData(offset,limit);
        responseDataCall.enqueue(new Callback<ResponseData>() {
            @Override
            public void onResponse(Call<ResponseData> call, Response<ResponseData> response) {

                Log.d("Response",response.body().getStatus().toString());
              responseDataMutableLiveData.setValue(response.body());

            }

            @Override
            public void onFailure(Call<ResponseData> call, Throwable t) {

                Log.d("Error",t.getMessage());

                //responseDataMutableLiveData.setValue(null);

            }
        });
        return responseDataMutableLiveData;

    }
}
