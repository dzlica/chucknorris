package com.greenfox.lica.chucknorris;

import java.util.List;

/**
 * Created by lica on 2017. 11. 30..
 */

public class Value {

    int id;
    String joke;
    List<String> categories;

    public Value(int id, String joke, List<String> categories) {
        this.id = id;
        this.joke = joke;
        this.categories = categories;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }
}
