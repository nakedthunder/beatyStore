package com.example.basic.amoreStore.store;

public class AmoreStoreServiceImpl implements AmoreStoreService{

    // DIP: 클라이언트 코드는 인터페이스에만 의존을 해야한다. (구현체는 몰라야함)
    /*
    * 작성방법
    * - 기존에 있던 구현체는 제거하고 인터페이스에만 의존하게 한다. (구현체에 대한 정보는 없다. => 생성자 주입)
    * - 생성자를 생선한다
    * - 생성자를 통해서 구현체를 선택한다.
    * */
    AmoreStoreRepository amoreStoreRepository = new MemoryAmoreStoreRepository();
    //private final AmoreStoreRepository amoreStoreRepository;



    @Override
    public void insertStoreInfo(AmoreStore amoreStore) {
        amoreStoreRepository.storeInfoSave(amoreStore);
    }

    @Override
    public AmoreStore searchAmoreStore(Long storeSn) {
        return amoreStoreRepository.findByStoreSn(storeSn);
    }
}
