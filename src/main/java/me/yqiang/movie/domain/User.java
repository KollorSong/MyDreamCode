package me.yqiang.movie.domain;

public class User {

    private Long id;
    private String password;
    private String userName;

    public User(Long id, String password, String userName) {
        this.id = id;
        this.password = password;
        this.userName = userName;
    }

    public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
}