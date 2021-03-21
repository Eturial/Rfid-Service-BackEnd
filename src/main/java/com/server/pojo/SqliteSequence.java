package com.server.pojo;

import java.io.Serializable;

/**
 * null
 * @TableName sqlite_sequence
 */
public class SqliteSequence implements Serializable {
    /**
     * 
     */
    private Object name;

    /**
     * 
     */
    private Object seq;

    private static final long serialVersionUID = 1L;

    /**
     */
    public Object getName() {
        return name;
    }

    /**
     */
    public void setName(Object name) {
        this.name = name;
    }

    /**
     */
    public Object getSeq() {
        return seq;
    }

    /**
     */
    public void setSeq(Object seq) {
        this.seq = seq;
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
        SqliteSequence other = (SqliteSequence) that;
        return (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSeq() == null ? other.getSeq() == null : this.getSeq().equals(other.getSeq()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", seq=").append(seq);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}