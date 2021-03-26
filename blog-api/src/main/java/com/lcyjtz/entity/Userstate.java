package com.lcyjtz.entity;

public class Userstate {
    private Integer stateId;

    private String stateType;

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getStateType() {
        return stateType;
    }

    public void setStateType(String stateType) {
        this.stateType = stateType == null ? null : stateType.trim();
    }
}