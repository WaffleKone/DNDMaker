package com.DNDMaker.springdemo.character;

public enum CurrencyTypes {
    GP("Gold"),
    CP("Copper"),
    SP("Silver"),
    PP("Platinum");

    public final String label;

    private CurrencyTypes(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
