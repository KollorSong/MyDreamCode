package me.yqiang.movie.domain;

public class Movie {

    private Long id;
    private String imaName;
    private String movieName;

    public Movie(Long id, String imaName, String movieName) {
        this.id = id;
        this.imaName = imaName;
        this.movieName = movieName;
    }

    public Movie() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImaName() {
        return imaName;
    }

    public void setImaName(String imaName) {
        this.imaName = imaName == null ? null : imaName.trim();
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName == null ? null : movieName.trim();
    }
}