package io.jahiduls.store.api;

import java.util.ServiceLoader;

public class StoreFactory {

    public static <E> Store<E> createStore() {

        ServiceLoader<StoreProvider> loader = ServiceLoader.load(StoreProvider.class);

        loader.stream().forEach(it -> System.out.println("INFO: found binding " + it.get().getClass().getCanonicalName()));

        if (loader.stream().count() > 1) {
            throw new RuntimeException("Too many bindings on classpath. Please use just one.");
        }

        StoreProvider storeProvider = loader.findFirst()
                .orElseThrow(() -> new RuntimeException("No bindings found on classpath."));

        return storeProvider.get();
    }

}
