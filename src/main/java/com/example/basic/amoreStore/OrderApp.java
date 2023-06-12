package com.example.basic.amoreStore;

import com.example.basic.amoreStore.deliveryInfo.DeliveryDetail;
import com.example.basic.amoreStore.deliveryInfo.DeliveryDetailPolicy;
import com.example.basic.amoreStore.order.Order;
import com.example.basic.amoreStore.order.OrderService;
import com.example.basic.amoreStore.order.OrderServiceImpl;
import com.example.basic.amoreStore.store.AmoreStore;
import com.example.basic.amoreStore.store.AmoreStoreService;
import com.example.basic.amoreStore.store.AmoreStoreServiceImpl;
import com.example.basic.amoreStore.store.Location;

public class OrderApp {
    public static void main(String[] args) {
        //AmoreStoreService amoreStoreService = new AmoreStoreServiceImpl();
       // OrderService orderService = new OrderServiceImpl();
       // DeliveryDetail deliveryDetailInfo = new DeliveryDetailPolicy();
        AppConfig appConfig = new AppConfig();
        AmoreStoreService amoreStoreService = appConfig.amoreStoreService();
        OrderService orderService = appConfig.orderService();

        // 아모레 정보를 저장해준다.
        long storeSn = 1L;
        AmoreStore amoreInfo = new AmoreStore(storeSn, "amoreJeju", Location.JEJU);
        amoreStoreService.insertStoreInfo(amoreInfo);

       // int deliveryDt = deliveryDetailInfo.deliveryDate(amoreInfo);

        Order order = orderService.createOrder(amoreInfo.getStoreSn(), "메이크업상품");

        System.out.println("주문내역 = " + order);
      //  System.out.println(amoreInfo.getStoreName() + "지역의 배송일은 " + deliveryDt + "입니다.");

    }
}
