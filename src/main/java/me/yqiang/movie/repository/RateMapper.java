package me.yqiang.movie.repository;


import me.yqiang.movie.domain.Rate;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Rate record);

    int insertSelective(Rate record);

    Rate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Rate record);

    int updateByPrimaryKey(Rate record);

    List<Rate> findByUserId(Long userId);


    List<?> findRateCount();
}