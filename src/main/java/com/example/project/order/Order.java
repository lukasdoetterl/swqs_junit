package com.example.project.order;

import java.math.BigDecimal;
import java.util.*;

public class Order {
    private Address invoiceAdress;
    private List<OrderItem> items;
    private BigDecimal totalPrice;

    public Order() {
        this.invoiceAdress = null;
        this.items = new ArrayList<OrderItem>();
        this.totalPrice = BigDecimal.ZERO;
    }

    public void setInvoiceAddress(Address invoiceAddress) {
        this.invoiceAdress = invoiceAddress;
    }

    public Address getInvoiceAddress() {
        return invoiceAdress;
    }

    public void addOrderItem(OrderItem orderItem) {
        items.add(orderItem);
        BigDecimal price = orderItem.getSalesPrice().multiply(new BigDecimal(orderItem.getQuantity()));
        totalPrice = totalPrice.add(price);
    }

    public List<OrderItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }
}
