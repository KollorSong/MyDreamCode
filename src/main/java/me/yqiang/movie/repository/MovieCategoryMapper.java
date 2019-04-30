package me.yqiang.movie.repository;


import me.yqiang.movie.domain.MovieCategory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MovieCategoryMapper {
    int deleteByPrimaryKey(String movieCategoryCode);

    int insert(MovieCategory record);

    int insertSelective(MovieCategory record);

    MovieCategory selectByPrimaryKey(String movieCategoryCode);

    int updateByPrimaryKeySelective(MovieCategory record);

    int updateByPrimaryKey(MovieCategory record);
}