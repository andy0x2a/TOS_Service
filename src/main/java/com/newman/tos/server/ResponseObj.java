package com.newman.tos.server;

/**
 * Created by IntelliJ IDEA.
 * User: anewman
 * Date: 5/12/14
 */
public class ResponseObj {
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public ResponseObj withStatus(String status) {
        setStatus(status);
        return this;
    }
}
