package com.lcyjtz.entity;

import com.lcyjtz.vo.ArticleAddVO;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Article {
    private Integer articleid;

    private String articlefilename;

    private String articledata;

    private String articletitle;

    private Integer articlecategcry;

    private Integer articleresourceid;

    private Boolean istop;

    private Boolean isdraft;

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

    public Integer getArticleresourceid() {
        return articleresourceid;
    }

    public void setArticleresourceid(Integer articleresourceid) {
        this.articleresourceid = articleresourceid;
    }

    public Boolean getIstop() {
        return istop;
    }

    public void setIstop(Boolean istop) {
        this.istop = istop;
    }

    public Boolean getIsdraft() {
        return isdraft;
    }

    public void setIsdraft(Boolean isdraft) {
        this.isdraft = isdraft;
    }

    public String getArticlecontent() {
        return articlecontent;
    }

    public void setArticlecontent(String articlecontent) {
        this.articlecontent = articlecontent == null ? null : articlecontent.trim();
    }

    public Article(ArticleAddVO articleAddVO) {
        this.articleid = articleAddVO.getArticleid();
        this.articlefilename = articleAddVO.getArticlefilename();
        this.articletitle = articleAddVO.getArticletitle();
        this.articlecategcry = articleAddVO.getArticlecategcry();
        this.articleresourceid = articleAddVO.getArticleresourceid();
        this.istop = articleAddVO.getIstop();
        this.isdraft = articleAddVO.getIsdraft();
        this.articlecontent = articleAddVO.getArticlecontent();
    }
}