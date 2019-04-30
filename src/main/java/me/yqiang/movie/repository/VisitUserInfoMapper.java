package me.yqiang.movie.repository;


import me.yqiang.movie.domain.VisitUserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VisitUserInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(VisitUserInfo record);

    int insertSelective(VisitUserInfo record);

    VisitUserInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(VisitUserInfo record);

    int updateByPrimaryKey(VisitUserInfo record);
}