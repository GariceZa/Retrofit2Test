package com.example.admin.retrofit2test;

import retrofit.Call;
import retrofit.http.GET;


/**
 * Created by Admin on 10/10/2015.
 */
public interface PostInfoApi {

    @GET("/posts/1")
    Call<PostInfo> getPost();
}
