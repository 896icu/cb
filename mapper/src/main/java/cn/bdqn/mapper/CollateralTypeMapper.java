package cn.bdqn.mapper;

import cn.bdqn.model.CollateralType;

public interface CollateralTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CollateralType record);

    int insertSelective(CollateralType record);

    CollateralType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CollateralType record);

    int updateByPrimaryKey(CollateralType record);
}