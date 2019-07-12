package com.bytedance.androidcamp.network.dou.api;

import com.bytedance.androidcamp.network.dou.model.GetVideosResponse;
import com.bytedance.androidcamp.network.dou.model.PostVideoResponse;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

public interface IMiniDouyinService {
    // TODO 7: Define IMiniDouyinService
    String HOST = "http://test.androidcamp.bytedance.com/mini_douyin/invoke/";

    @GET("video") Call<GetVideosResponse> getVideos();

    @Multipart
    @POST("video") Call<PostVideoResponse> postVideo(
            @Query("student_id") String student_id,
            @Query("user_name") String user_name,
            @Part MultipartBody.Part image, @Part MultipartBody.Part video
            );

}
