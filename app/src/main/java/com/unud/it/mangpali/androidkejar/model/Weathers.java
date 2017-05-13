package com.unud.it.mangpali.androidkejar.model;

/**
 * Created by Mangpali on 5/13/2017.
 */

public class Weathers {
    private int id;
    private String main;
    private String description;

    public Weathers(int id, String main, String description) {
        this.id = id;
        this.main = main;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
