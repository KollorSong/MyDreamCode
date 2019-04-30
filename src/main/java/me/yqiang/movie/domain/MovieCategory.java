package me.yqiang.movie.domain;

public class MovieCategory {

    private String movieCategoryCode;
    private String movieCategoryName;

    public MovieCategory(String movieCategoryCode, String movieCategoryName) {
        this.movieCategoryCode = movieCategoryCode;
        this.movieCategoryName = movieCategoryName;
    }

    public MovieCategory() {
        super();
    }

    public String getMovieCategoryCode() {
        return movieCategoryCode;
    }

    public void setMovieCategoryCode(String movieCategoryCode) {
        this.movieCategoryCode = movieCategoryCode == null ? null : movieCategoryCode.trim();
    }

    public String getMovieCategoryName() {
        return movieCategoryName;
    }

    public void setMovieCategoryName(String movieCategoryName) {
        this.movieCategoryName = movieCategoryName == null ? null : movieCategoryName.trim();
    }
}