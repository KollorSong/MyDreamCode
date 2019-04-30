package me.yqiang.movie.domain;

import java.util.Date;

public class SystemLog {

    private String logId;
    private String logName;
    private String logContent;
    private String logLevel;
    private Date logCreateDate;

    public SystemLog(String logId, String logName, String logContent, String logLevel, Date logCreateDate) {
        this.logId = logId;
        this.logName = logName;
        this.logContent = logContent;
        this.logLevel = logLevel;
        this.logCreateDate = logCreateDate;
    }

    public SystemLog() {
        super();
    }

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId == null ? null : logId.trim();
    }

    public String getLogName() {
        return logName;
    }

    public void setLogName(String logName) {
        this.logName = logName == null ? null : logName.trim();
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent == null ? null : logContent.trim();
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel == null ? null : logLevel.trim();
    }

    public Date getLogCreateDate() {
        return logCreateDate;
    }

    public void setLogCreateDate(Date logCreateDate) {
        this.logCreateDate = logCreateDate;
    }
}