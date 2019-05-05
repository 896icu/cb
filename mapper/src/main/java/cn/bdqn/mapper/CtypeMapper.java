package cn.bdqn.mapper;

import cn.bdqn.model.Ctype;

public interface CtypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ctype record);

    int insertSelective(Ctype record);

    Ctype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ctype record);

    int updateByPrimaryKey(Ctype record);
}