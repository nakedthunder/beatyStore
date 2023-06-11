package com.example.basic.amoreStore.order;

public class Order {

    private Long amoreStoreSn;
    private String itemName;
    private int deliveryDate;

    public Order(Long amoreStoreSn, String itemName, int deliveryDate) {
        this.amoreStoreSn = amoreStoreSn;
        this.itemName = itemName;
        this.deliveryDate = deliveryDate;
    }

    public Long getAmoreStoreSn() {
        return amoreStoreSn;
    }

    public void setAmoreStoreSn(Long amoreStoreSn) {
        this.amoreStoreSn = amoreStoreSn;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(int deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
