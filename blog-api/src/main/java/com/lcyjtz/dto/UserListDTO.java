package com.lcyjtz.dto;

/**
 * @autHor LHYJTZ
 * @data 2021年04月14日 13:59
 */

import lombok.Data;
@Data
public class UserListDTO {

    private String avatar;

    private String visitorname;

    private String email;

    private String powertype;

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
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

    public String getPowertype() {
        return powertype;
    }

    public void setPowertype(String powertype) {
        this.powertype = powertype;
    }
}
