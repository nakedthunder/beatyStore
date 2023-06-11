package com.example.basic.amoreStore.store;

public class AmoreStore {
    // 가게일련번호, 이름, 위치
    private Long storeSn;
    private String storeName;
    private Location location;

    public AmoreStore(Long storeSn, String storeName, Location location) {
        this.storeSn = storeSn;
        this.storeName = storeName;
        this.location = location;
    }

    public Long getStoreSn() {
        return storeSn;
    }

    public void setStoreSn(Long storeSn) {
        this.storeSn = storeSn;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
