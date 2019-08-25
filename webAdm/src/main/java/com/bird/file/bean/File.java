package com.bird.file.bean;

import java.io.Serializable;
import java.util.Date;

public class File implements Serializable {
    private String fileId;

    private String filePath;

    private Integer userId;

    private Date lastDealTime;

    private String fielName;

    private Integer fielStatus;

    private static final long serialVersionUID = 1L;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getLastDealTime() {
        return lastDealTime;
    }

    public void setLastDealTime(Date lastDealTime) {
        this.lastDealTime = lastDealTime;
    }

    public String getFielName() {
        return fielName;
    }

    public void setFielName(String fielName) {
        this.fielName = fielName == null ? null : fielName.trim();
    }

    public Integer getFielStatus() {
        return fielStatus;
    }

    public void setFielStatus(Integer fielStatus) {
        this.fielStatus = fielStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fileId=").append(fileId);
        sb.append(", filePath=").append(filePath);
        sb.append(", userId=").append(userId);
        sb.append(", lastDealTime=").append(lastDealTime);
        sb.append(", fielName=").append(fielName);
        sb.append(", fielStatus=").append(fielStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}