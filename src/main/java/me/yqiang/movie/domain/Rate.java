package me.yqiang.movie.domain;

public class Rate {

    private Long id;
    private Long movieId;
    private Double rate;
    private Long userId;

    public Rate(Long id, Long movieId, Double rate, Long userId) {
        this.id = id;
        this.movieId = movieId;
        this.rate = rate;
        this.userId = userId;
    }

    public Rate() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}