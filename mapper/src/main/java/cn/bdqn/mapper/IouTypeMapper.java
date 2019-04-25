package cn.bdqn.mapper;

import cn.bdqn.model.IouType;

public interface IouTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IouType record);

    int insertSelective(IouType record);

    IouType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IouType record);

    int updateByPrimaryKey(IouType record);
}