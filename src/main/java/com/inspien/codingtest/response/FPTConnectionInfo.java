package com.inspien.codingtest.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FPTConnectionInfo {
/*
    "FTP_CONN_INFO": {
        "HOST": "211.106.171.36",
        "PORT": 20421,
        "USER": "inspien01",
        "PASSWORD": "inspien01",
        "FILE_PATH": "/"
    }
 */
    @JsonProperty("HOST")
    String host;

    @JsonProperty("PORT")
    String port;

    @JsonProperty("USER")
    String user;

    @JsonProperty("PASSWORD")
    String password;

    @JsonProperty("FILE_PATH")
    String filePath;

}
