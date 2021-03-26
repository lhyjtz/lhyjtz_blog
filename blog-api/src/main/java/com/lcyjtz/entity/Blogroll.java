package com.lcyjtz.entity;

public class Blogroll {
    private String links;

    private Integer llinksId;

    public String getLinks() {
        return links;
    }

    public void setLinks(String links) {
        this.links = links == null ? null : links.trim();
    }

    public Integer getLlinksId() {
        return llinksId;
    }

    public void setLlinksId(Integer llinksId) {
        this.llinksId = llinksId;
    }
}