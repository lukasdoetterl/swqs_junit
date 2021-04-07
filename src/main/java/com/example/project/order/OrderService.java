package com.example.project.order;

//import org.graalvm.compiler.core.common.type.ArithmeticOpTable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderService {

  private Map<String,BigDecimal> shippingCosts = new HashMap<String, BigDecimal>();

  public OrderService(Map<String,BigDecimal> shippingCosts) {
    this.shippingCosts = shippingCosts;
  }

  /**
   * How much is the shipping?
   */
  public BigDecimal getShippingCosts(Order order) { // testing
    BigDecimal totalAmount = order.getTotalPrice();
    totalAmount = totalAmount.add(shippingCosts.get(order.getInvoiceAddress().getCountryISO()));
    return totalAmount;
  }
}
