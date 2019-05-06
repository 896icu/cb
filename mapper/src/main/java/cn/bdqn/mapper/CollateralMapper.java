package cn.bdqn.mapper;

import cn.bdqn.model.Collateral;

public interface CollateralMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Collateral record);

    int insertSelective(Collateral record);

    Collateral selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Collateral record);

    int updateByPrimaryKey(Collateral record);
}