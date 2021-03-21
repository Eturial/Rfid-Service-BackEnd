package com.server.pojo;

import java.io.Serializable;

/**
 * null
 * @TableName Log
 */
public class Log implements Serializable {
    /**
     * 
     */
    private Integer logid;

    /**
     * 
     */
    private Integer fromUserid;

    /**
     * 
     */
    private Integer toUserid;

    /**
     * 
     */
    private Integer status;

    /**
     * 
     */
    private Integer requeststatus;

    /**
     * 
     */
    private String log;

    /**
     * 
     */
    private String fromTime;

    /**
     * 
     */
    private String toTime;

    private static final long serialVersionUID = 1L;

    /**
     */
    public Integer getLogid() {
        return logid;
    }

    /**
     */
    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    /**
     */
    public Integer getFromUserid() {
        return fromUserid;
    }

    /**
     */
    public void setFromUserid(Integer fromUserid) {
        this.fromUserid = fromUserid;
    }

    /**
     */
    public Integer getToUserid() {
        return toUserid;
    }

    /**
     */
    public void setToUserid(Integer toUserid) {
        this.toUserid = toUserid;
    }

    /**
     */
    public Integer getStatus() {
        return status;
    }

    /**
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     */
    public Integer getRequeststatus() {
        return requeststatus;
    }

    /**
     */
    public void setRequeststatus(Integer requeststatus) {
        this.requeststatus = requeststatus;
    }

    /**
     */
    public String getLog() {
        return log;
    }

    /**
     */
    public void setLog(String log) {
        this.log = log;
    }

    /**
     */
    public String getFromTime() {
        return fromTime;
    }

    /**
     */
    public void setFromTime(String fromTime) {
        this.fromTime = fromTime;
    }

    /**
     */
    public String getToTime() {
        return toTime;
    }

    /**
     */
    public void setToTime(String toTime) {
        this.toTime = toTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Log other = (Log) that;
        return (this.getLogid() == null ? other.getLogid() == null : this.getLogid().equals(other.getLogid()))
            && (this.getFromUserid() == null ? other.getFromUserid() == null : this.getFromUserid().equals(other.getFromUserid()))
            && (this.getToUserid() == null ? other.getToUserid() == null : this.getToUserid().equals(other.getToUserid()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRequeststatus() == null ? other.getRequeststatus() == null : this.getRequeststatus().equals(other.getRequeststatus()))
            && (this.getLog() == null ? other.getLog() == null : this.getLog().equals(other.getLog()))
            && (this.getFromTime() == null ? other.getFromTime() == null : this.getFromTime().equals(other.getFromTime()))
            && (this.getToTime() == null ? other.getToTime() == null : this.getToTime().equals(other.getToTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLogid() == null) ? 0 : getLogid().hashCode());
        result = prime * result + ((getFromUserid() == null) ? 0 : getFromUserid().hashCode());
        result = prime * result + ((getToUserid() == null) ? 0 : getToUserid().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRequeststatus() == null) ? 0 : getRequeststatus().hashCode());
        result = prime * result + ((getLog() == null) ? 0 : getLog().hashCode());
        result = prime * result + ((getFromTime() == null) ? 0 : getFromTime().hashCode());
        result = prime * result + ((getToTime() == null) ? 0 : getToTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logid=").append(logid);
        sb.append(", fromUserid=").append(fromUserid);
        sb.append(", toUserid=").append(toUserid);
        sb.append(", status=").append(status);
        sb.append(", requeststatus=").append(requeststatus);
        sb.append(", log=").append(log);
        sb.append(", fromTime=").append(fromTime);
        sb.append(", toTime=").append(toTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}