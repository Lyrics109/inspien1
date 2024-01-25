package com.inspien.codingtest.db.entity;

import lombok.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "PurchaseOrder")
public class InspienXmlDataInfo {
    private final LocalDateTime currentDt = LocalDateTime.now();
    private String sender = "팜반키엔"; // 본인 이름

    @XmlElement(name = "HEADER")
    private Header[] headers;

    @XmlElement(name = "DETAIL")
    private Detail[] details;

    @Getter
    @Setter
    @ToString
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlRootElement(name = "HEADER")
    public static class Header {
        @XmlElement(name = "ORDER_NUM")
        private String orderNum; // ORDER_NUM

        @XmlElement(name = "ORDER_ID")
        private String orderId;// ORDER_ID

        @XmlElement(name = "ORDER_DATE")
        private String orderDate; // ORDER_DATE

        @XmlElement(name = "ORDER_PRICE")
        private String orderPrice; // ORDER_PRICE

        @XmlElement(name = "ORDER_QTY")
        private String orderQty; // ORDER_QTY

        @XmlElement(name = "RECEIVER_NAME")
        private String receiverName; // RECEIVER_NAME

        @XmlElement(name = "RECEIVER_NO")
        private String receiverNo; // RECEIVER_NO

        @XmlElement(name = "ETA_DATE")
        private String etaDate; // ETA_DATE

        @XmlElement(name = "DESTINATION")
        private String destination; // DESTINATION

        @XmlElement(name = "DESCIPTION")
        private String desciption; // DESCIPTION
    }

    @Getter
    @Setter
    @ToString
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlRootElement(name = "DETAIL")
    public static class Detail {

        @XmlElement(name = "ORDER_NUM")
        private String orderNum; // ORDER_NUM   XML

        @XmlElement(name = "ITEM_SEQ")
        private String itemSeq; // ITEM_SEQ

        @XmlElement(name = "ITEM_NAME")
        private String itemName; // ITEM_NAME

        @XmlElement(name = "ITEM_QTY")
        private String itemQty; // ITEM_QTY

        @XmlElement(name = "ITEM_COLOR")
        private String itemColor; // ITEM_COLOR

        @XmlElement(name = "ITEM_PRICE")
        private String itemPrice; // ITEM_PRICE
    }

}
