package com.lcyjtz.entity;

public class Resource {
    private Integer resourceTypeid;

    private String resourceType;

    public Integer getResourceTypeid() {
        return resourceTypeid;
    }

    public void setResourceTypeid(Integer resourceTypeid) {
        this.resourceTypeid = resourceTypeid;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }
}