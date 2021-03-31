package com.lcyjtz.dto;

import lombok.Data;

import java.util.Date;

@Data

public class UserDTO {

    private Integer visitorid;

    private String visitorname;

    private String email;

    private String powertype;

    private Boolean issilence;

    private Date createtime;

    private Date updatetime;

    private String avatar;

}