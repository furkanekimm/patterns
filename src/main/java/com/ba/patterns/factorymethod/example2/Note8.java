package com.ba.patterns.factorymethod.example2;

public class Note8 implements Phone {
    private String model;
    @Override
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
