package io.jahiduls.store.inmemory;

import io.jahiduls.store.api.Entity;
import io.jahiduls.store.api.Store;

import java.util.Optional;

public class InMemoryStore<E> implements Store<E> {

    private static final String TAG = "inmemory: ";

    public Optional<E> get(Entity entity) {
        System.out.println(TAG + "retrieving entity from store");

        return Optional.empty();
    }

    public void put(E e) {
        System.out.println(TAG + "persisting entity to store");
    }

    public void delete(E e) {
        System.out.println(TAG + "deleting entity from store");
    }

}
