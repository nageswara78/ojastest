package com.example.nagestest.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.nagestest.R;
import com.example.nagestest.databinding.ActivityUserDisplayPageBinding;
import com.example.nagestest.model.pojo.ResponseData;
import com.example.nagestest.model.pojo.UsersData;
import com.example.nagestest.view.adapters.UsersAdapter;
import com.example.nagestest.viewmodel.UsersDisplayPage;

import java.util.List;

public class UserDisplayPage extends AppCompatActivity {
    ActivityUserDisplayPageBinding userDisplayPageBinding;
    UsersDisplayPage usersDisplayPageViewModel;
    MutableLiveData<ResponseData> mutableResponseData;
    UsersAdapter usersAdapter;
    RecyclerView recyclerViewUsers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        userDisplayPageBinding = DataBindingUtil.setContentView(this, R.layout.activity_user_display_page);
        usersDisplayPageViewModel = ViewModelProviders.of(this).get(UsersDisplayPage.class);
        mutableResponseData= usersDisplayPageViewModel.getResponseDataMutableLiveData(getApplicationContext(),"10","10");
        mutableResponseData.observe(this, new Observer<ResponseData>() {
            @Override
            public void onChanged(ResponseData responseData) {

                List<UsersData> data= responseData.getData().getUsersData();
                usersAdapter = new UsersAdapter(getApplicationContext(),data);
                recyclerViewUsers=userDisplayPageBinding.listRecylerview;
                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext(),RecyclerView.VERTICAL,false);
                recyclerViewUsers.setLayoutManager(layoutManager);
                recyclerViewUsers.setAdapter(usersAdapter);
            }
        });






    }
}
