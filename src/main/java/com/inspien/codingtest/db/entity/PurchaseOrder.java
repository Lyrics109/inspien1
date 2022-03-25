package com.inspien.codingtest.db.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PurchaseOrder {
    private String currentDt; //  = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    private String sender = "키엔"; // 본인 이름
    private String orderNum; // ORDER_NUM
    private String itemSeq; // ITEM_SEQ
    private String orderId;// ORDER_ID
    private String orderDate; // ORDER_DATE
    private String orderPrice; // ORDER_PRICE
    private String orderQty; // ORDER_QTY
    private String receiverName; // RECEIVER_NAME
    private String receiverNo; // RECEIVER_NO
    private String etaDate; // ETA_DATE
    private String destination; // DESTINATION
    private String desciption; // DESCIPTION
    private String itemName; // ITEM_NAME
    private String itemQty; // ITEM_QTY
    private String itemColor; // ITEM_COLOR
    private String itemPrice; // ITEM_PRICE

    @Builder
    public PurchaseOrder(String orderNum, String itemSeq, String orderId, String orderDate, String orderPrice, String orderQty, String receiverName, String receiverNo, String etaDate, String destination, String desciption, String itemName, String itemQty, String itemColor, String itemPrice, String sender, String currentDt) {
        this.orderNum = orderNum;
        this.itemSeq = itemSeq;
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderPrice = orderPrice;
        this.orderQty = orderQty;
        this.receiverName = receiverName;
        this.receiverNo = receiverNo;
        this.etaDate = etaDate;
        this.destination = destination;
        this.desciption = desciption;
        this.itemName = itemName;
        this.itemQty = itemQty;
        this.itemColor = itemColor;
        this.itemPrice = itemPrice;
        this.sender = sender;
        this.currentDt = currentDt;
    }
}
