package com.lcyjtz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Users {
    private Integer VisitorID;
    private String VisitorName;
    private String VisitorPwd;
    private Integer VisitorRoleID;
    private String Email;
    private Integer VisitorState;
}
