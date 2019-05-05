package cn.bdqn.mapper;

import cn.bdqn.model.Producttype;

public interface ProducttypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Producttype record);

    int insertSelective(Producttype record);

    Producttype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Producttype record);

    int updateByPrimaryKey(Producttype record);
}