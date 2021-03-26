package com.lcyjtz.entity;

public class Slideshow {
    private String slideshowName;

    private String slideshowPath;

    private Integer slideshowShow;

    public String getSlideshowName() {
        return slideshowName;
    }

    public void setSlideshowName(String slideshowName) {
        this.slideshowName = slideshowName == null ? null : slideshowName.trim();
    }

    public String getSlideshowPath() {
        return slideshowPath;
    }

    public void setSlideshowPath(String slideshowPath) {
        this.slideshowPath = slideshowPath == null ? null : slideshowPath.trim();
    }

    public Integer getSlideshowShow() {
        return slideshowShow;
    }

    public void setSlideshowShow(Integer slideshowShow) {
        this.slideshowShow = slideshowShow;
    }
}