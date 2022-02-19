package io.jahiduls.store.app;

import io.jahiduls.store.api.Store;
import io.jahiduls.store.api.StoreFactory;

public class App {
    
    public static void main(String[] args) {

        SimpleEntity entity = new SimpleEntity();
        Store<SimpleEntity> store = StoreFactory.createStore();

        store.put(entity);
        store.get(entity);
        store.delete(entity);

    }
    
}
