package io.jahiduls.store.mongo;

import io.jahiduls.store.api.Store;
import io.jahiduls.store.api.StoreProvider;

public class MongoStoreProvider implements StoreProvider {

    @Override
    public <E> Store<E> get() {
        return new MongoStore<>();
    }

}
