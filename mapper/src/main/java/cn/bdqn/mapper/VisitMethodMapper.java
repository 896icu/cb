package cn.bdqn.mapper;

import cn.bdqn.model.VisitMethod;

public interface VisitMethodMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VisitMethod record);

    int insertSelective(VisitMethod record);

    VisitMethod selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VisitMethod record);

    int updateByPrimaryKey(VisitMethod record);
}