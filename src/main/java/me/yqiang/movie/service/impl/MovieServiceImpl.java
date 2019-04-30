package me.yqiang.movie.service.impl;

import com.github.pagehelper.PageInfo;
import me.yqiang.movie.domain.Movie;
import me.yqiang.movie.repository.MovieMapper;
import me.yqiang.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieMapper movieMapper;


    @Override
    public void save(Movie movie) {
        movieMapper.insert(movie);
    }

    @Override
    public PageInfo<List<Movie>> findAll(Integer page, Integer size) {
        return null;
    }

    @Override
    public List<Movie> findAll() {
        return movieMapper.findAll();
    }

    @Override
    public Movie getOne(Long id) {
        return movieMapper.getOne(id);
    }
}
