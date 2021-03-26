package com.lcyjtz.entity;

public class Article {
    private Integer articleId;

    private String articleFilename;

    private String articlePath;

    private String articleData;

    private String articleTitle;

    private String articleIntroduce;

    private String articleType;

    private String articlePictureId;

    private Integer articleResourceId;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleFilename() {
        return articleFilename;
    }

    public void setArticleFilename(String articleFilename) {
        this.articleFilename = articleFilename == null ? null : articleFilename.trim();
    }

    public String getArticlePath() {
        return articlePath;
    }

    public void setArticlePath(String articlePath) {
        this.articlePath = articlePath == null ? null : articlePath.trim();
    }

    public String getArticleData() {
        return articleData;
    }

    public void setArticleData(String articleData) {
        this.articleData = articleData == null ? null : articleData.trim();
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public String getArticleIntroduce() {
        return articleIntroduce;
    }

    public void setArticleIntroduce(String articleIntroduce) {
        this.articleIntroduce = articleIntroduce == null ? null : articleIntroduce.trim();
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType == null ? null : articleType.trim();
    }

    public String getArticlePictureId() {
        return articlePictureId;
    }

    public void setArticlePictureId(String articlePictureId) {
        this.articlePictureId = articlePictureId == null ? null : articlePictureId.trim();
    }

    public Integer getArticleResourceId() {
        return articleResourceId;
    }

    public void setArticleResourceId(Integer articleResourceId) {
        this.articleResourceId = articleResourceId;
    }
}