package io.jahiduls.store.api;

import java.util.Optional;

public interface Store<I> {

    Optional<I> get(Entity entity);
    void put(I item);
    void delete(I item);

}
