package com.itch.demo.entity;

import java.io.Serializable;

/**
 * 用户表
 */
public class Users implements Serializable {

    private Long id;
    private String uName;
    private String pwds;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getPwds() {
        return pwds;
    }

    public void setPwds(String pwds) {
        this.pwds = pwds;
    }
}
