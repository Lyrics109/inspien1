package com.inspien.codingtest.db.repository;

import com.inspien.codingtest.db.entity.PurchaseOrder;

import java.util.List;

public interface PurchaseOrderRepository {
    int save(PurchaseOrder purchaseOrder);
    List<PurchaseOrder> getPurchasesContainSender(String sender);

}
