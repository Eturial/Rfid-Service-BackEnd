package com.server.pojo;

import java.io.Serializable;

/**
 * null
 * @TableName Repo
 */
public class Repo implements Serializable {
    /**
     * 
     */
    private Integer repoid;

    /**
     * 
     */
    private String info;

    /**
     * 
     */
    private Integer managerid;

    private static final long serialVersionUID = 1L;

    /**
     */
    public Integer getRepoid() {
        return repoid;
    }

    /**
     */
    public void setRepoid(Integer repoid) {
        this.repoid = repoid;
    }

    /**
     */
    public String getInfo() {
        return info;
    }

    /**
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     */
    public Integer getManagerid() {
        return managerid;
    }

    /**
     */
    public void setManagerid(Integer managerid) {
        this.managerid = managerid;
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
        Repo other = (Repo) that;
        return (this.getRepoid() == null ? other.getRepoid() == null : this.getRepoid().equals(other.getRepoid()))
            && (this.getInfo() == null ? other.getInfo() == null : this.getInfo().equals(other.getInfo()))
            && (this.getManagerid() == null ? other.getManagerid() == null : this.getManagerid().equals(other.getManagerid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRepoid() == null) ? 0 : getRepoid().hashCode());
        result = prime * result + ((getInfo() == null) ? 0 : getInfo().hashCode());
        result = prime * result + ((getManagerid() == null) ? 0 : getManagerid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", repoid=").append(repoid);
        sb.append(", info=").append(info);
        sb.append(", managerid=").append(managerid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}