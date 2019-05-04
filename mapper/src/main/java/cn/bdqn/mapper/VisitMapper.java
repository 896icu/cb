package cn.bdqn.mapper;

import cn.bdqn.model.Visit;

public interface VisitMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Visit record);

    int insertSelective(Visit record);

    Visit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Visit record);

    int updateByPrimaryKey(Visit record);
}