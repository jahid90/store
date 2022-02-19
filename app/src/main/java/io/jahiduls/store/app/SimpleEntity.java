package io.jahiduls.store.app;

import io.jahiduls.store.api.Entity;

public class SimpleEntity implements Entity {

    public String getId() {
        return toString();
    }

}
