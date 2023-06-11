package com.example.basic.amoreStore.store;

public interface AmoreStoreService {

    void insertStoreInfo(AmoreStore amoreStore);

    AmoreStore searchAmoreStore(Long storeSn);
}
