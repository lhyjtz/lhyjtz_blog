package com.lcyjtz.entity;

import com.lcyjtz.dto.UserUpdateDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Visitor {
    private Integer visitorid;

    private String visitorname;

    private String visitorpwd;

    private String avatar;

    private Integer visitorroleid;

    private String email;

    private Integer visitorstate;

    private String visitorresume;

    private Date createtime;

    private Date updatetime;

    private Boolean issilence;

    private Boolean logindelete;


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
        this.visitorname = visitorname == null ? null : visitorname.trim();
    }

    public String getVisitorpwd() {
        return visitorpwd;
    }

    public void setVisitorpwd(String visitorpwd) {
        this.visitorpwd = visitorpwd == null ? null : visitorpwd.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public Integer getVisitorroleid() {
        return visitorroleid;
    }

    public void setVisitorroleid(Integer visitorroleid) {
        this.visitorroleid = visitorroleid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getVisitorstate() {
        return visitorstate;
    }

    public void setVisitorstate(Integer visitorstate) {
        this.visitorstate = visitorstate;
    }

    public String getVisitorresume() {
        return visitorresume;
    }

    public void setVisitorresume(String visitorresume) {
        this.visitorresume = visitorresume == null ? null : visitorresume.trim();
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

    public Boolean getIssilence() {
        return issilence;
    }

    public void setIssilence(Boolean issilence) {
        this.issilence = issilence;
    }

    public Boolean getLogindelete() {
        return logindelete;
    }

    public void setLogindelete(Boolean logindelete) {
        this.logindelete = logindelete;
    }

    public Visitor(UserUpdateDTO userUpdateDTO) {
        this.visitorid = userUpdateDTO.getVisitorid();
        this.avatar = userUpdateDTO.getAvatar();
        this.visitorname = userUpdateDTO.getVisitorname();
        this.email = userUpdateDTO.getEmail();
        this.issilence = userUpdateDTO.getIssilence();
        this.createtime = userUpdateDTO.getCreatetime();
        this.updatetime = userUpdateDTO.getUpdatetime();
    }
}