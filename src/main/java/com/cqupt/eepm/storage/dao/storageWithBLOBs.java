package com.cqupt.eepm.storage.dao;

public class storageWithBLOBs extends storage {
    private String evidence;

    private String secretKey;

    private String blocknumber;

    public String getEvidence() {
        return evidence;
    }

    public void setEvidence(String evidence) {
        this.evidence = evidence == null ? null : evidence.trim();
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey == null ? null : secretKey.trim();
    }

    public String getBlocknumber() {
        return blocknumber;
    }

    public void setBlocknumber(String blocknumber) {
        this.blocknumber = blocknumber == null ? null : blocknumber.trim();
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
        storageWithBLOBs other = (storageWithBLOBs) that;
        return (this.getEvidenceid() == null ? other.getEvidenceid() == null : this.getEvidenceid().equals(other.getEvidenceid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getUploadtime() == null ? other.getUploadtime() == null : this.getUploadtime().equals(other.getUploadtime()))
            && (this.getMd5() == null ? other.getMd5() == null : this.getMd5().equals(other.getMd5()))
            && (this.getDirectory() == null ? other.getDirectory() == null : this.getDirectory().equals(other.getDirectory()))
            && (this.getEvidence() == null ? other.getEvidence() == null : this.getEvidence().equals(other.getEvidence()))
            && (this.getSecretKey() == null ? other.getSecretKey() == null : this.getSecretKey().equals(other.getSecretKey()))
            && (this.getBlocknumber() == null ? other.getBlocknumber() == null : this.getBlocknumber().equals(other.getBlocknumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEvidenceid() == null) ? 0 : getEvidenceid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getUploadtime() == null) ? 0 : getUploadtime().hashCode());
        result = prime * result + ((getMd5() == null) ? 0 : getMd5().hashCode());
        result = prime * result + ((getDirectory() == null) ? 0 : getDirectory().hashCode());
        result = prime * result + ((getEvidence() == null) ? 0 : getEvidence().hashCode());
        result = prime * result + ((getSecretKey() == null) ? 0 : getSecretKey().hashCode());
        result = prime * result + ((getBlocknumber() == null) ? 0 : getBlocknumber().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", evidence=").append(evidence);
        sb.append(", secretKey=").append(secretKey);
        sb.append(", blocknumber=").append(blocknumber);
        sb.append("]");
        return sb.toString();
    }
}