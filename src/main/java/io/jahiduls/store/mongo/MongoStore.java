package io.jahiduls.store.mongo;

import io.jahiduls.store.api.Entity;
import io.jahiduls.store.api.Store;

import java.util.Optional;

public class MongoStore<E> implements Store<E> {

    private static final String TAG = "mongo: ";

    @Override
    public Optional<E> get(Entity entity) {
        System.out.println(TAG + "retrieving from store");
        return Optional.empty();
    }

    @Override
    public void put(E item) {
        System.out.println(TAG + "persisting into store");
    }

    @Override
    public void delete(E item) {
        System.out.println(TAG + "deleting from store");
    }

}
