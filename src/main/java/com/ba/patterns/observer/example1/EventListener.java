package com.ba.patterns.observer.example1;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
