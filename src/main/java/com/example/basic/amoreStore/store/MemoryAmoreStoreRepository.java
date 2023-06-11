package com.example.basic.amoreStore.store;

import java.util.HashMap;
import java.util.Map;

public class MemoryAmoreStoreRepository implements AmoreStoreRepository{

    // 와 이거 private static으로 안하니깐 store 계속 null로 들어감
    // 기능을 구현하는 것보다 더 큰것을 얻었네
    private static Map<Long, AmoreStore> store = new HashMap<>();
    @Override
    public void storeInfoSave(AmoreStore amoreStore) {
        // 스토어에 관한걸 저장
        store.put(amoreStore.getStoreSn(), amoreStore);
    }

    @Override
    public AmoreStore findByStoreSn(Long storeSn) {
        // 일련번호로 조회
        return store.get(storeSn);
    }
}
