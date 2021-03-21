package com.server.pojo;

import java.io.Serializable;

/**
 * null
 * @TableName User
 */
public class User implements Serializable {
    /**
     * 
     */
    private Integer userid;

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private Integer gender;

    /**
     * 
     */
    private Integer permission;

    /**
     * 
     */
    private String faceinfo;

    private static final long serialVersionUID = 1L;

    /**
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     */
    public String getUsername() {
        return username;
    }

    /**
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     */
    public Integer getGender() {
        return gender;
    }

    /**
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     */
    public Integer getPermission() {
        return permission;
    }

    /**
     */
    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    /**
     */
    public String getFaceinfo() {
        return faceinfo;
    }

    /**
     */
    public void setFaceinfo(String faceinfo) {
        this.faceinfo = faceinfo;
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
        User other = (User) that;
        return (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getPermission() == null ? other.getPermission() == null : this.getPermission().equals(other.getPermission()))
            && (this.getFaceinfo() == null ? other.getFaceinfo() == null : this.getFaceinfo().equals(other.getFaceinfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getPermission() == null) ? 0 : getPermission().hashCode());
        result = prime * result + ((getFaceinfo() == null) ? 0 : getFaceinfo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", gender=").append(gender);
        sb.append(", permission=").append(permission);
        sb.append(", faceinfo=").append(faceinfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}