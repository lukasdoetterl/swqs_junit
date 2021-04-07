package com.example.project.order;

import java.math.BigDecimal;

public class OrderItem {
  private int itemId;
  private int quantity;
  private BigDecimal salesPrice;

  public OrderItem(int itemId, int quantity, BigDecimal salesPrice) {
    //super();
    this.itemId = itemId;
    this.quantity = quantity;
    this.salesPrice = salesPrice;
  }

  public int getItemId() {
    return itemId;
  }

  public int getQuantity() {
    return quantity;
  }

  public BigDecimal getSalesPrice() {
    return salesPrice;
  }
}
