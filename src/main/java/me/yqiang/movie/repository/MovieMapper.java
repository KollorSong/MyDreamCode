package me.yqiang.movie.repository;


import me.yqiang.movie.domain.Movie;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MovieMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Movie record);

    int insertSelective(Movie record);

    Movie selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Movie record);

    int updateByPrimaryKey(Movie record);

    List<Movie> findAll();

    Movie getOne(Long id);


}