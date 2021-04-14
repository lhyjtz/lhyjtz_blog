package com.lcyjtz.dto;

import lombok.Data;

import java.util.Date;

/**
 * @autHor LHYJTZ
 * @data 2021年04月14日 9:37
 */
@Data
public class UserUpdateDTO {
    private String avatar;
    private Integer visitorid;
    private String visitorname;
    private String email;
    private Boolean issilence;
    private String powertype;
    private String userAuth;
    private Date createtime;
    private Date updatetime;

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getVisitorid() {
        return visitorid;
    }

    public void setVisitorid(Integer visitorid) {
        this.visitorid = visitorid;
    }

    public String getVisitorname() {
        return visitorname;
    }

    public void setVisitorname(String visitorname) {
        this.visitorname = visitorname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIssilence() {
        return issilence;
    }

    public void setIssilence(Boolean issilence) {
        this.issilence = issilence;
    }

    public String getPowertype() {
        return powertype;
    }

    public void setPowertype(String powertype) {
        this.powertype = powertype;
    }

    public String getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(String userAuth) {
        this.userAuth = userAuth;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}
