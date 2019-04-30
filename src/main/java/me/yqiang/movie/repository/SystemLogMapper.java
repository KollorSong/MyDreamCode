package me.yqiang.movie.repository;

import me.yqiang.movie.domain.SystemLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SystemLogMapper {
    int deleteByPrimaryKey(String logId);

    int insert(SystemLog record);

    int insertSelective(SystemLog record);

    SystemLog selectByPrimaryKey(String logId);

    int updateByPrimaryKeySelective(SystemLog record);

    int updateByPrimaryKey(SystemLog record);
}