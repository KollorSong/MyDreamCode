package me.yqiang.movie.domain;

import java.util.Date;

public class WebLinks {

    private String webId;
    private String webName;
    private String webLink;
    private String crawlFlag;
    private Date insertDate;
    private Date updateDate;

    public WebLinks(String webId, String webName, String webLink, String crawlFlag, Date insertDate, Date updateDate) {
        this.webId = webId;
        this.webName = webName;
        this.webLink = webLink;
        this.crawlFlag = crawlFlag;
        this.insertDate = insertDate;
        this.updateDate = updateDate;
    }

    public WebLinks() {
        super();
    }

    public String getWebId() {
        return webId;
    }

    public void setWebId(String webId) {
        this.webId = webId == null ? null : webId.trim();
    }

    public String getWebName() {
        return webName;
    }

    public void setWebName(String webName) {
        this.webName = webName == null ? null : webName.trim();
    }

    public String getWebLink() {
        return webLink;
    }

    public void setWebLink(String webLink) {
        this.webLink = webLink == null ? null : webLink.trim();
    }

    public String getCrawlFlag() {
        return crawlFlag;
    }

    public void setCrawlFlag(String crawlFlag) {
        this.crawlFlag = crawlFlag == null ? null : crawlFlag.trim();
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}