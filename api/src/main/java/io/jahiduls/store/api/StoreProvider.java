package io.jahiduls.store.api;

public interface StoreProvider {

    public <E> Store<E> get();

}
