package com.example.nagestest.model.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {
 @SerializedName("users")
 @Expose
 List<UsersData> usersData;

 public List<UsersData> getUsersData() {
  return usersData;
 }

 public void setUsersData(List<UsersData> usersData) {
  this.usersData = usersData;
 }
}
