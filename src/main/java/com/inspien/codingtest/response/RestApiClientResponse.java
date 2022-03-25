package com.inspien.codingtest.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RestApiClientResponse {

    @JsonProperty("XML_DATA")
    String xmlData;

    @JsonProperty("JSON_DATA")
    String jsonData;

    @JsonProperty("DB_CONN_INFO")
    DBConnectionInfo dbConnectionInfo;

    @JsonProperty("FTP_CONN_INFO")
    FPTConnectionInfo ftpConnectionInfo;

}
