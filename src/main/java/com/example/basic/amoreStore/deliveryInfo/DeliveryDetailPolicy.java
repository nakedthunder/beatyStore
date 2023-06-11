package com.example.basic.amoreStore.deliveryInfo;

import com.example.basic.amoreStore.store.AmoreStore;
import com.example.basic.amoreStore.store.Location;

public class DeliveryDetailPolicy implements DeliveryDetail{

    int jejuLocation;
    int seoulLocation;
    int surburbLocation;

    @Override
    public int deliveryDate(AmoreStore amoreStore) {

        if (amoreStore.getLocation() == Location.JEJU) {
            return jejuLocation = 7;
        } else if (amoreStore.getLocation() == Location.SURBURB) {
            return surburbLocation =  3;
        }
        return 1;
    }
}
