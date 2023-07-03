package com.ohgiraffers.layeredjwtrest.common.vo;

public enum Role {
    ADMIN("ADMIN"),
    USER("USER");

    private String value;

    Role(String value) {
        this.value = value;
    }

    public String getKey(){
        return name();
    }

    public String getValue(){

        return value;
    }
}
