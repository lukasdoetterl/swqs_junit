package com.example.project.order;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;
import java.util.List;

class OrderTests {

   // @Test
   // @DisplayName("Testing: addorderitem method")
    // test: item adding
    /*void addoderitemtest() {
        OrderItem apple = new OrderItem(4545,3,new BigDecimal(0.5));
        Address one = new Address("123","Franz","Peter","Hauptstraße 45", "Konstanz", "78462",
                "DE");
        Order oneone = new Order();
        oneone.setInvoiceAddress(one);
        oneone.addOrderItem(apple);
        assertEquals(4545, oneone.getItems().get(0).getItemId(),"First function should return apple");
    }*/
    @Test
    @DisplayName("Testing: addorderitem function correctly")
    void secondmethod() {
        // setup
        OrderItem apple = new OrderItem(4545,3,new BigDecimal(0.5));
        Address one = new Address("123","Franz","Peter","Hauptstraße 45", "Konstanz", "78462",
                "DE");
        Order oneone = new Order();
        oneone.setInvoiceAddress(one);
        // execute
        oneone.addOrderItem(apple);
        // verify
        assertEquals(new BigDecimal(1.5), oneone.getTotalPrice(),"Total price should be 1.5");
    }


}
