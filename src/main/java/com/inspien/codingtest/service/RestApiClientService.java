package com.inspien.codingtest.service;

import com.inspien.codingtest.db.entity.PurchaseOrder;
import com.inspien.codingtest.request.RestApiClientRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RestApiClientService {
    Boolean callInspienApi(RestApiClientRequest request) throws Exception;

    Page<PurchaseOrder> getPagePurchases(String sender, Pageable pageable);


//    Boolean pullFileToFtpServer(String fileName, FTPClient ftpClient, InputStream inputStream) throws IOException;
}
