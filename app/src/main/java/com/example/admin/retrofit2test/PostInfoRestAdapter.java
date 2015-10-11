package com.example.admin.retrofit2test;

import java.io.IOException;

import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by Admin on 10/10/2015.
 */
public class PostInfoRestAdapter {

    private PostInfoApi postInfoApi;

    public  PostInfoRestAdapter(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        postInfoApi = retrofit.create(PostInfoApi.class);
    }

    public void getPostForUserId( Callback callback) throws IOException{
        postInfoApi.getPost().enqueue(callback);
    }
}
