package com.ba.patterns.observer.example2;

public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
