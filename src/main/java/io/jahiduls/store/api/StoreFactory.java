package io.jahiduls.store.api;

import java.util.ServiceLoader;

public class StoreFactory {

    public static <E> Store<E> createStore() {

        ServiceLoader<StoreProvider> loader = ServiceLoader.load(StoreProvider.class);

        StoreProvider storeProvider = loader.findFirst()
                .orElseThrow(() -> new RuntimeException("No bindings found on classpath."));

        return storeProvider.get();
    }

}
