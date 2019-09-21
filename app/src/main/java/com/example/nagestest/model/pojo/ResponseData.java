package com.example.nagestest.model.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseData {
    @SerializedName("status")
    @Expose
    Boolean status;
    @SerializedName("message")
    @Expose
    Object message;
    @SerializedName("data")
    @Expose
    Data data;
    @SerializedName("has_more")
    @Expose
    boolean hasMore;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }
}
