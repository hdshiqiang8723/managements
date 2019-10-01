package com.itch.demo.entity;

import java.io.Serializable;

/**
 * 登陆次数
 */
public class Shangci implements Serializable {

    private Long id;
    private Users uid;
    private String sdate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Users getUid() {
        return uid;
    }

    public void setUid(Users uid) {
        this.uid = uid;
    }

    public String getSdate() {
        return sdate;
    }

    public void setSdate(String sdate) {
        this.sdate = sdate;
    }
}
