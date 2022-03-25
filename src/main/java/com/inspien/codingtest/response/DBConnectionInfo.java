package com.inspien.codingtest.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DBConnectionInfo {
    /*
    "DB_CONN_INFO": {
        "HOST": "211.106.171.36",
        "PORT": 11527,
        "SID": "POS",
        "USER": "inspien01",
        "PASSWORD": "inspien01",
        "TABLENAME": "INSPIEN_XMLDATA_INFO"
    }
     */
    @JsonProperty("HOST")
    String host;

    @JsonProperty("PORT")
    String port;

    @JsonProperty("SID")
    String sid;

    @JsonProperty("USER")
    String user;

    @JsonProperty("PASSWORD")
    String password;

    @JsonProperty("TABLENAME")
    String tableName;
}
