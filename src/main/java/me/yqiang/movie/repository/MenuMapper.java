package me.yqiang.movie.repository;


import me.yqiang.movie.domain.Menu;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MenuMapper {
    int deleteByPrimaryKey(String menuId);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(String menuId);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}