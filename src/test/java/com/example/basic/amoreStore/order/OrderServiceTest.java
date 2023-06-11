package com.example.basic.amoreStore.order;

import com.example.basic.amoreStore.deliveryInfo.DeliveryDetail;
import com.example.basic.amoreStore.deliveryInfo.DeliveryDetailPolicy;
import com.example.basic.amoreStore.store.AmoreStore;
import com.example.basic.amoreStore.store.AmoreStoreService;
import com.example.basic.amoreStore.store.AmoreStoreServiceImpl;
import com.example.basic.amoreStore.store.Location;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    AmoreStoreService amoreService = new AmoreStoreServiceImpl();
    DeliveryDetail deliveryDetail = new DeliveryDetailPolicy();
    OrderService orderService = new OrderServiceImpl();
    @Test
    @DisplayName("아모레지점 위치에 따른 배송일 구하기")
    void getLocationDate() {
        AmoreStore amoreStoreInfo = new AmoreStore(1L, "한라봉점", Location.JEJU);
        amoreService.insertStoreInfo(amoreStoreInfo);

        int dliveryDt = deliveryDetail.deliveryDate(amoreStoreInfo);

        Order order = orderService.createOrder(amoreStoreInfo.getStoreSn(),"메이크업");

        Assertions.assertThat(dliveryDt).isEqualTo(7);
    }
 }