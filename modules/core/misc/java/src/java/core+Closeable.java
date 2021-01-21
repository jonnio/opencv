package org.opencv.core;

public interface Closeable extends AutoCloseable {

    @Override
    void close();
}
