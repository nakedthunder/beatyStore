package com.example.basic.amoreStore.store;

public interface AmoreStoreRepository {

    void storeInfoSave(AmoreStore amoreStore);

    AmoreStore findByStoreSn(Long storeSn);
}
