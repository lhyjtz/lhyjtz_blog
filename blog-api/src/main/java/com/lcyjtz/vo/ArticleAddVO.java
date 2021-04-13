package com.lcyjtz.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @autHor LHYJTZ
 * @data 2021年04月13日 10:43
 */

@Data
public class ArticleAddVO implements Serializable {
    private Integer articleid;

    private String articlefilename;

    private String articledata;

    private String articletitle;

    private Integer articlecategcry;

    private Integer articleresourceid;

    private Boolean istop;

    private Boolean isdraft;

    private String articlecontent;

    private List<Integer> tagIdList;

    public List<Integer> getTagIdList() {
        return tagIdList;
    }

    public void setTagIdList(List<Integer> tagIdList) {
        this.tagIdList = tagIdList;
    }

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
        this.articlefilename = articlefilename;
    }

    public String getArticledata() {
        return articledata;
    }

    public void setArticledata(String articledata) {
        this.articledata = articledata;
    }

    public String getArticletitle() {
        return articletitle;
    }

    public void setArticletitle(String articletitle) {
        this.articletitle = articletitle;
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
        this.articlecontent = articlecontent;
    }

}
