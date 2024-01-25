package com.inspien.codingtest.common;

import com.inspien.codingtest.db.entity.PurchaseOrder;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PurchaserRowMapper implements RowMapper<PurchaseOrder> {
    @Override
    public PurchaseOrder mapRow(ResultSet rs, int rowNum) throws SQLException {
        PurchaseOrder po = PurchaseOrder.builder()
                .orderNum(rs.getString("ORDER_NUM"))
                .itemSeq(rs.getString("ITEM_SEQ"))
                .orderId(rs.getString("ORDER_ID"))
                .orderDate(rs.getString("ORDER_DATE"))
                .orderPrice(rs.getString("ORDER_PRICE"))
                .orderQty(rs.getString("ORDER_QTY"))
                .receiverName(rs.getString("RECEIVER_NAME"))
                .receiverNo(rs.getString("RECEIVER_NO"))
                .etaDate(rs.getString("ETA_DATE"))
                .destination(rs.getString("DESTINATION"))
                .desciption(rs.getString("DESCIPTION"))
                .itemName(rs.getString("ITEM_NAME"))
                .itemQty(rs.getString("ITEM_QTY"))
                .itemColor(rs.getString("ITEM_COLOR"))
                .itemPrice(rs.getString("ITEM_PRICE"))
                .sender(rs.getString("SENDER"))
                .currentDt(rs.getString("CURRENT_DT"))
                .build();
        return po;
    }
}
