package com.example.myapplication.retrofit;

import com.example.myapplication.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UserApi {
    @GET ("/api/v1/user/getall")
    Call<List<User>>getAll();
    @POST("/api/v1/user/save")
    Call<User>save(@Body User user );
}
