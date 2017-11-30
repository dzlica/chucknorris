package com.greenfox.lica.chucknorris;

/**
 * Created by lica on 2017. 11. 30..
 */

class Chuck {

    private String type;
    Value value;

    public Chuck(String type, Value value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
