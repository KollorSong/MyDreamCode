package me.yqiang.movie.domain;

public class Menu {

    private String menuId;
    private String menuName;
    private String menuHref;
    private String menuParentId;
    private String menuFlag;
    private String menuIcon;
    private String createDate;
    private String updateDate;

    public Menu(String menuId, String menuName, String menuHref, String menuParentId, String menuFlag, String menuIcon, String createDate, String updateDate) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.menuHref = menuHref;
        this.menuParentId = menuParentId;
        this.menuFlag = menuFlag;
        this.menuIcon = menuIcon;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public Menu() {
        super();
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuHref() {
        return menuHref;
    }

    public void setMenuHref(String menuHref) {
        this.menuHref = menuHref == null ? null : menuHref.trim();
    }

    public String getMenuParentId() {
        return menuParentId;
    }

    public void setMenuParentId(String menuParentId) {
        this.menuParentId = menuParentId == null ? null : menuParentId.trim();
    }

    public String getMenuFlag() {
        return menuFlag;
    }

    public void setMenuFlag(String menuFlag) {
        this.menuFlag = menuFlag == null ? null : menuFlag.trim();
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon == null ? null : menuIcon.trim();
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate == null ? null : updateDate.trim();
    }
}