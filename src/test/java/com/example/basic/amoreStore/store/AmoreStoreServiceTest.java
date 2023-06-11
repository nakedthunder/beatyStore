package com.example.basic.amoreStore.store;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AmoreStoreServiceTest {

    AmoreStoreService amoreStoreService = new AmoreStoreServiceImpl();

    @Test
    @DisplayName("아모레 지점등록, 조회")
    void join() {
        AmoreStore amoreStore = new AmoreStore(1L, "amoreSeoul", Location.SEOUL);

        amoreStoreService.insertStoreInfo(amoreStore);
        AmoreStore amoreInfo = amoreStoreService.searchAmoreStore(amoreStore.getStoreSn());

        Assertions.assertThat(amoreStore).isEqualTo(amoreInfo);
    }

}