package com.inspien.codingtest.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.inspien.codingtest.common.service.InspienService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

@Configuration
public class RetrofitConfig {

    @Bean
    public InspienService inspienService(ObjectMapper objectMapper){
        Retrofit retrofit2 = new Retrofit.Builder().baseUrl("http://211.106.171.36:50000/RESTAdapter/RecruitingTest/")
                .addConverterFactory(JacksonConverterFactory.create(objectMapper))
                .build();
        return retrofit2.create(InspienService.class);
    }
}
