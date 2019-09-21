package com.example.nagestest.model.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UsersData {
    @SerializedName("name")
    @Expose
    String userName;
    @SerializedName("image")
    @Expose
    String image;
    @SerializedName("items")
    @Expose
    String[] items;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }
}
