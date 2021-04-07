package com.example.project.order;
import static org.junit.jupiter.api.Assertions.assertEquals;


import com.example.project.Trimmer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

class OrderServiceTests {
    @Test
    @DisplayName("testing if shipping cost calculated correctly")

    void shipcost() {
        //setup
        Address one = new Address("123","Franz","Peter","Hauptstraße 45", "Konstanz", "78462",
                "DE");
        OrderItem apple = new OrderItem(4545,2,new BigDecimal("0.5"));
        OrderItem orange = new OrderItem(3232,3,new BigDecimal("0.4"));
        OrderItem birne = new OrderItem(3333,5,new BigDecimal("0.1"));
        Order order = new Order();
        order.setInvoiceAddress(one);
        order.addOrderItem(apple);
        order.addOrderItem(orange);
        order.addOrderItem(birne);
        Map<String, BigDecimal> abcd = new HashMap<String, BigDecimal>();
        abcd.put("DE",new BigDecimal(5));
        abcd.put("ES",new BigDecimal(10));
        abcd.put("GB",new BigDecimal(10));
        OrderService abc = new OrderService(abcd);
        // execute and verify
        assertEquals(new BigDecimal("7.7").stripTrailingZeros(),
                abc.getShippingCosts(order).stripTrailingZeros());

    }
}
