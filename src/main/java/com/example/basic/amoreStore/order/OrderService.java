package com.example.basic.amoreStore.order;

import com.example.basic.amoreStore.store.AmoreStore;

public interface OrderService {

    Order createOrder(Long storeSn, String itemName);


}
