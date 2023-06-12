package com.example.basic.amoreStore;

import com.example.basic.amoreStore.deliveryInfo.DeliveryDetailPolicy;
import com.example.basic.amoreStore.order.OrderService;
import com.example.basic.amoreStore.order.OrderServiceImpl;
import com.example.basic.amoreStore.store.AmoreStoreService;
import com.example.basic.amoreStore.store.AmoreStoreServiceImpl;
import com.example.basic.amoreStore.store.MemoryAmoreStoreRepository;

public class AppConfig {

    //구현체 객체 생성이 되는데, 생성자에 들어가보면 MemoryAmoreStoreRepository가 생성된다.
    public AmoreStoreService amoreStoreService() {
        return new AmoreStoreServiceImpl();
    }

    public OrderService orderService() {
        return new
                OrderServiceImpl(new MemoryAmoreStoreRepository(), new DeliveryDetailPolicy());
    }
}
