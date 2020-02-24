package com.github.couchmove.utils;

import org.junit.jupiter.api.AfterEach;
import org.testcontainers.couchbase.AbstractCouchbaseTest;
import org.testcontainers.couchbase.CouchbaseContainer;

public abstract class CouchbaseTest extends AbstractCouchbaseTest {

    private static CouchbaseContainer container = initCouchbaseContainer("couchbase/server:6.0.3");

    @Override
    protected CouchbaseContainer getCouchbaseContainer() {
        container.start();
        return container;
    }

    @AfterEach
    public void clear() {
        super.clear();
    }
}
