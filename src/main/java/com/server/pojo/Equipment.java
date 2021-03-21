package com.server.pojo;

import java.io.Serializable;

/**
 * null
 * @TableName Equipment
 */
public class Equipment implements Serializable {
    /**
     * 
     */
    private Integer deviceid;

    /**
     * 
     */
    private String devicename;

    /**
     * 
     */
    private Integer status;

    private static final long serialVersionUID = 1L;

    /**
     */
    public Integer getDeviceid() {
        return deviceid;
    }

    /**
     */
    public void setDeviceid(Integer deviceid) {
        this.deviceid = deviceid;
    }

    /**
     */
    public String getDevicename() {
        return devicename;
    }

    /**
     */
    public void setDevicename(String devicename) {
        this.devicename = devicename;
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
        Equipment other = (Equipment) that;
        return (this.getDeviceid() == null ? other.getDeviceid() == null : this.getDeviceid().equals(other.getDeviceid()))
            && (this.getDevicename() == null ? other.getDevicename() == null : this.getDevicename().equals(other.getDevicename()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDeviceid() == null) ? 0 : getDeviceid().hashCode());
        result = prime * result + ((getDevicename() == null) ? 0 : getDevicename().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deviceid=").append(deviceid);
        sb.append(", devicename=").append(devicename);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}