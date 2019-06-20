package com.xning.signview.signdate;

import org.litepal.crud.LitePalSupport;

import java.util.Date;

public class SignIn extends LitePalSupport {
    private long id;
    private int sid;
    private Date date;

    public SignIn() {
    }

    public SignIn(int sid, Date date) {
        this.sid = sid;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
