package com.inspien.codingtest.db.repository;

import com.inspien.codingtest.common.PurchaserRowMapper;
import com.inspien.codingtest.db.entity.PurchaseOrder;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcPurchaseOrderRepository implements PurchaseOrderRepository {
    private final JdbcTemplate jdbcTemplate;

    public JdbcPurchaseOrderRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /*
INSERT INTO INSPIEN_XMLDATA_INFO imi (imi.ORDER_NUM, imi.ITEM_SEQ, imi.ORDER_ID, imi.ORDER_DATE,imi.ORDER_PRICE,imi.ORDER_QTY,imi.RECEIVER_NAME,imi.RECEIVER_NO,
 imi.ETA_DATE,imi.DESTINATION,imi.DESCIPTION, imi.ITEM_NAME, imi.ITEM_QTY, imi.ITEM_COLOR, imi.ITEM_PRICE, imi.SENDER)
VALUES ('키엔 테스트','키엔 테스트','키엔 테스트','키엔 테스트','키엔 테스트','키엔 테스트','키엔 테스트','키엔 테스트','키엔 테스트',
        '키엔 테스트','키엔 테스트','키엔 테스트','키엔 테스트','키엔 테스트','키엔 테스트','키엔')
     */

    @Override
    public int save(PurchaseOrder purchaseOrder) {
        String sql = "INSERT INTO INSPIEN_XMLDATA_INFO (ORDER_NUM, ITEM_SEQ, ORDER_ID, ORDER_DATE, ORDER_PRICE, ORDER_QTY,RECEIVER_NAME,RECEIVER_NO, ETA_DATE, DESTINATION, DESCIPTION, ITEM_NAME, ITEM_QTY, ITEM_COLOR, ITEM_PRICE, SENDER) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            return jdbcTemplate.update(
                    sql,
                    purchaseOrder.getOrderNum()
                    , purchaseOrder.getItemSeq()
                    , purchaseOrder.getOrderId()
                    , purchaseOrder.getOrderDate()
                    , purchaseOrder.getOrderPrice()
                    , purchaseOrder.getOrderQty()
                    , purchaseOrder.getReceiverName()
                    , purchaseOrder.getReceiverNo()
                    , purchaseOrder.getEtaDate()
                    , purchaseOrder.getDestination()
                    , purchaseOrder.getDesciption()
                    , purchaseOrder.getItemName()
                    , purchaseOrder.getItemQty()
                    , purchaseOrder.getItemColor()
                    , purchaseOrder.getItemPrice()
                    , "키엔"
            );
        } catch (DataAccessException e) {
            System.err.println("In catch DataAccessException: " + e.getClass());
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    @Override
    public List<PurchaseOrder> getPurchasesContainSender(String sender) {
//where event_date between '2020-01-01 12:00:00' and '2020-01-01 23:30:00';
        String sql = "SELECT* FROM INSPIEN_XMLDATA_INFO ";
        StringBuilder sb = new StringBuilder(sql);
        if (sender != null) {
            sb.append("WHERE SENDER like '%").append(sender).append("%' and TRUNC(CURRENT_DT) = TRUNC(sysdate)");
        }
        return jdbcTemplate.query(sb.toString(), new PurchaserRowMapper());
    }
}
