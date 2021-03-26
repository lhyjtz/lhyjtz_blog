package com.lcyjtz.entity;

public class Video {
    private Integer videoId;

    private String videoFilename;

    private String videoPath;

    private String videoData;

    private String videoTitle;

    private String videoPictureId;

    private String videoType;

    private Integer videoResourceId;

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getVideoFilename() {
        return videoFilename;
    }

    public void setVideoFilename(String videoFilename) {
        this.videoFilename = videoFilename == null ? null : videoFilename.trim();
    }

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath == null ? null : videoPath.trim();
    }

    public String getVideoData() {
        return videoData;
    }

    public void setVideoData(String videoData) {
        this.videoData = videoData == null ? null : videoData.trim();
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle == null ? null : videoTitle.trim();
    }

    public String getVideoPictureId() {
        return videoPictureId;
    }

    public void setVideoPictureId(String videoPictureId) {
        this.videoPictureId = videoPictureId == null ? null : videoPictureId.trim();
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType == null ? null : videoType.trim();
    }

    public Integer getVideoResourceId() {
        return videoResourceId;
    }

    public void setVideoResourceId(Integer videoResourceId) {
        this.videoResourceId = videoResourceId;
    }
}