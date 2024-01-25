package com.inspien.codingtest.rest;

import com.inspien.codingtest.db.entity.PurchaseOrder;
import com.inspien.codingtest.request.RestApiClientRequest;
import com.inspien.codingtest.service.RestApiClientService;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/inspiens")
public class RestApiClientController {
    private final RestApiClientService restApiClientService;

    public RestApiClientController(RestApiClientService restApiClientService) {
        this.restApiClientService = restApiClientService;
    }

    @PostMapping("handling-data")
    public ResponseEntity<Boolean> callInspienApi(
            @RequestBody RestApiClientRequest request
    ) throws Exception {
        Boolean response = restApiClientService.callInspienApi(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/purchases")
    public ResponseEntity<Page<PurchaseOrder>> getPagePurchases(
            @Ignore Pageable pageable,
            @RequestParam(required = false) String sender
    ) {
        Page<PurchaseOrder> response = restApiClientService.getPagePurchases(sender, pageable);
        return ResponseEntity.ok(response);
    }
}
