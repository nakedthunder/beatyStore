package com.example.basic.amoreStore;

import com.example.basic.amoreStore.store.AmoreStore;
import com.example.basic.amoreStore.store.AmoreStoreService;
import com.example.basic.amoreStore.store.AmoreStoreServiceImpl;
import com.example.basic.amoreStore.store.Location;

public class AmoreStoreApp {
    public static void main(String[] args) {
        // 생성자 생서해서
        // 등록하고
        // 조회하고

        // 구현체를 터트려야지
        //AmoreStoreService amoreStoreService = new AmoreStoreServiceImpl();
        AppConfig appConfig = new AppConfig();
        AmoreStoreService amoreStoreService = appConfig.amoreStoreService();

        AmoreStore amore = new AmoreStore(1L, "amoreSeoul", Location.SEOUL);
        amoreStoreService.insertStoreInfo(amore);

        // 조회해서 값 봐야하니깐
        AmoreStore amoreInfo = amoreStoreService.searchAmoreStore(amore.getStoreSn());

        System.out.println("amoreInfo =" + amoreInfo);
    }
}
