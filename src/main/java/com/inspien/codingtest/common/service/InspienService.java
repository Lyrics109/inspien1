package com.inspien.codingtest.common.service;

import com.inspien.codingtest.request.RestApiClientRequest;
import com.inspien.codingtest.response.RestApiClientResponse;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

@Service
public interface InspienService {

    @POST(".")
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=utf-8")
    Call<RestApiClientResponse> inspienPost(@Body RestApiClientRequest restApiClientRequest);

}
