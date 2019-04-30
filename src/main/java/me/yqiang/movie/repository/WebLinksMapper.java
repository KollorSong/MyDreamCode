package me.yqiang.movie.repository;


import me.yqiang.movie.domain.WebLinks;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WebLinksMapper {
    int deleteByPrimaryKey(String webId);

    int insert(WebLinks record);

    int insertSelective(WebLinks record);

    WebLinks selectByPrimaryKey(String webId);

    int updateByPrimaryKeySelective(WebLinks record);

    int updateByPrimaryKey(WebLinks record);
}