package io.jahiduls.store.inmemory;

import io.jahiduls.store.api.Store;
import io.jahiduls.store.api.StoreProvider;

public class InMemoryStoreProvider implements StoreProvider {

    public <E> Store<E> get() {
        return new InMemoryStore<>();
    }

}
