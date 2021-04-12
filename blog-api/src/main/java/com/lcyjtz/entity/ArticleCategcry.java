package com.lcyjtz.entity;

public class ArticleCategcry {
    private Integer id;

    private String categcry;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategcry() {
        return categcry;
    }

    public void setCategcry(String categcry) {
        this.categcry = categcry == null ? null : categcry.trim();
    }
}