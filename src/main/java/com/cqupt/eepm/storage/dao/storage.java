package com.cqupt.eepm.storage.dao;

import java.util.Date;

public class storage {
    private Integer evidenceid;

	private Integer userid;

	private Date uploadtime;

	private String md5;

	private String directory;

	public Integer getEvidenceid() {
		return evidenceid;
	}

	public void setEvidenceid(Integer evidenceid) {
		this.evidenceid = evidenceid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Date getUploadtime() {
		return uploadtime;
	}

	public void setUploadtime(Date uploadtime) {
		this.uploadtime = uploadtime;
	}

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5 == null ? null : md5.trim();
	}

	public String getDirectory() {
		return directory;
	}

	public void setDirectory(String directory) {
		this.directory = directory == null ? null : directory.trim();
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
		storage other = (storage) that;
		return (this.getEvidenceid() == null ? other.getEvidenceid() == null
				: this.getEvidenceid().equals(other.getEvidenceid()))
				&& (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
				&& (this.getUploadtime() == null ? other.getUploadtime() == null
						: this.getUploadtime().equals(other.getUploadtime()))
				&& (this.getMd5() == null ? other.getMd5() == null : this.getMd5().equals(other.getMd5()))
				&& (this.getDirectory() == null ? other.getDirectory() == null
						: this.getDirectory().equals(other.getDirectory()));
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
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", evidenceid=").append(evidenceid);
		sb.append(", userid=").append(userid);
		sb.append(", uploadtime=").append(uploadtime);
		sb.append(", md5=").append(md5);
		sb.append(", directory=").append(directory);
		sb.append("]");
		return sb.toString();
	}

}