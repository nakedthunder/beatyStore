package com.example.basic.amoreStore.order;

import com.example.basic.amoreStore.deliveryInfo.DeliveryDetail;
import com.example.basic.amoreStore.deliveryInfo.DeliveryDetailPolicy;
import com.example.basic.amoreStore.store.AmoreStore;
import com.example.basic.amoreStore.store.AmoreStoreRepository;
import com.example.basic.amoreStore.store.MemoryAmoreStoreRepository;

public class OrderServiceImpl implements OrderService{

    /*
    *  생성자의 주입을 통해 의존관계 설정
    *   1. 구현체를 제거하고 인터페이스에만 의존
    *   2. 생성자를 생성한다.
    * */
    AmoreStoreRepository amoreStoreRepository;
    DeliveryDetail deliveryDetail;

    public OrderServiceImpl(AmoreStoreRepository amoreStoreRepository, DeliveryDetail deliveryDetail) {
        this.amoreStoreRepository = amoreStoreRepository;
        this.deliveryDetail = deliveryDetail;
    }
/*
    private final AmoreStoreRepository amoreStoreRepository;
    private final DeliveryDetail deliveryDetail;

    public OrderServiceImpl(AmoreStoreRepository amoreStoreRepository, DeliveryDetail deliveryDetail) {
        this.amoreStoreRepository = amoreStoreRepository;
        this.deliveryDetail = deliveryDetail;
    }
*/

    @Override
    public Order createOrder(Long storeSn, String itemName) {
        AmoreStore amoreStore = amoreStoreRepository.findByStoreSn(storeSn);
        int deliverydt =  deliveryDetail.deliveryDate(amoreStore);


        return new Order(amoreStore.getStoreSn(), itemName, deliverydt);
    }
}
