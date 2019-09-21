package com.example.nagestest.view.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nagestest.R;
import com.example.nagestest.databinding.UsersItemBinding;
import com.example.nagestest.model.pojo.ResponseData;
import com.example.nagestest.model.pojo.UsersData;

import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.MyViewHolder> {
    UsersItemBinding usersItemBinding;
    List<UsersData> usersData;
    Context context;


    public UsersAdapter(Context context,List<UsersData> usersData) {
        this.usersData = usersData;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(context);
        usersItemBinding= DataBindingUtil.inflate(layoutInflater, R.layout.users_item,parent,false);


        return new MyViewHolder(usersItemBinding) ;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return usersData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        public MyViewHolder(@NonNull ViewDataBinding itemView) {
            super(itemView.getRoot());
        }

    }
}
