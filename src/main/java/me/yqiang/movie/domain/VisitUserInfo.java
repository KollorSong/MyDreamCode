package me.yqiang.movie.domain;

import java.util.Date;

public class VisitUserInfo {

    private String id;
    private String userName;
    private String source;
    private String ipAddress;
    private String ip;
    private String hostName;
    private Date visitDate;

    public VisitUserInfo(String id, String userName, String source, String ipAddress, String ip, String hostName, Date visitDate) {
        this.id = id;
        this.userName = userName;
        this.source = source;
        this.ipAddress = ipAddress;
        this.ip = ip;
        this.hostName = hostName;
        this.visitDate = visitDate;
    }

    public VisitUserInfo() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName == null ? null : hostName.trim();
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }
}