package com.inspien.codingtest.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class RestApiClientRequest {
/*
    {
        "NAME":＂과제수행자 이름",
        "PHONE_NUMBER":＂과제수행자 전화번호",
        "E_MAIL":＂과제수행자 이메일주소"
    }
 */

    @JsonProperty("NAME")
    String name;

    @JsonProperty("PHONE_NUMBER")
    String phoneNumber;

    @JsonProperty("E_MAIL")
    String email;
}
