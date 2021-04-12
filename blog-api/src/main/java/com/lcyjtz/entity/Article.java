package com.lcyjtz.entity;

public class Article {
    private Integer articleid;

    private String articlefilename;

    private String articledata;

    private String articletitle;

    private Integer articlecategcry;

    private Integer articletypeid;

    private Integer articleresourceid;

    private String articlecontent;

    public Integer getArticleid() {
        return articleid;
    }

    public void setArticleid(Integer articleid) {
        this.articleid = articleid;
    }

    public String getArticlefilename() {
        return articlefilename;
    }

    public void setArticlefilename(String articlefilename) {
        this.articlefilename = articlefilename == null ? null : articlefilename.trim();
    }

    public String getArticledata() {
        return articledata;
    }

    public void setArticledata(String articledata) {
        this.articledata = articledata == null ? null : articledata.trim();
    }

    public String getArticletitle() {
        return articletitle;
    }

    public void setArticletitle(String articletitle) {
        this.articletitle = articletitle == null ? null : articletitle.trim();
    }

    public Integer getArticlecategcry() {
        return articlecategcry;
    }

    public void setArticlecategcry(Integer articlecategcry) {
        this.articlecategcry = articlecategcry;
    }

    public Integer getArticletypeid() {
        return articletypeid;
    }

    public void setArticletypeid(Integer articletypeid) {
        this.articletypeid = articletypeid;
    }

    public Integer getArticleresourceid() {
        return articleresourceid;
    }

    public void setArticleresourceid(Integer articleresourceid) {
        this.articleresourceid = articleresourceid;
    }

    public String getArticlecontent() {
        return articlecontent;
    }

    public void setArticlecontent(String articlecontent) {
        this.articlecontent = articlecontent == null ? null : articlecontent.trim();
    }
}