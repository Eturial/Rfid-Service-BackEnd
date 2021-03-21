package com.server.pojo;

import java.io.Serializable;

/**
 * null
 * @TableName sqlite_master
 */
public class SqliteMaster implements Serializable {
    /**
     * 
     */
    private String type;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String tblName;

    /**
     * 
     */
    private Integer rootpage;

    /**
     * 
     */
    private String sql;

    private static final long serialVersionUID = 1L;

    /**
     */
    public String getType() {
        return type;
    }

    /**
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     */
    public String getName() {
        return name;
    }

    /**
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     */
    public String getTblName() {
        return tblName;
    }

    /**
     */
    public void setTblName(String tblName) {
        this.tblName = tblName;
    }

    /**
     */
    public Integer getRootpage() {
        return rootpage;
    }

    /**
     */
    public void setRootpage(Integer rootpage) {
        this.rootpage = rootpage;
    }

    /**
     */
    public String getSql() {
        return sql;
    }

    /**
     */
    public void setSql(String sql) {
        this.sql = sql;
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
        SqliteMaster other = (SqliteMaster) that;
        return (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTblName() == null ? other.getTblName() == null : this.getTblName().equals(other.getTblName()))
            && (this.getRootpage() == null ? other.getRootpage() == null : this.getRootpage().equals(other.getRootpage()))
            && (this.getSql() == null ? other.getSql() == null : this.getSql().equals(other.getSql()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTblName() == null) ? 0 : getTblName().hashCode());
        result = prime * result + ((getRootpage() == null) ? 0 : getRootpage().hashCode());
        result = prime * result + ((getSql() == null) ? 0 : getSql().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", type=").append(type);
        sb.append(", name=").append(name);
        sb.append(", tblName=").append(tblName);
        sb.append(", rootpage=").append(rootpage);
        sb.append(", sql=").append(sql);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}