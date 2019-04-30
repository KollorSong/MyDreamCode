package me.yqiang.movie.service;

import com.github.pagehelper.PageInfo;
import me.yqiang.movie.domain.Movie;

import java.util.List;

public interface MovieService {

    void save(Movie movie);

    PageInfo<List<Movie>> findAll(Integer page, Integer size);

    List<Movie> findAll();

    Movie getOne(Long id);

}
