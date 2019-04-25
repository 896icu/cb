package cn.bdqn.mapper;

import cn.bdqn.model.LendDetail;

public interface LendDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LendDetail record);

    int insertSelective(LendDetail record);

    LendDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LendDetail record);

    int updateByPrimaryKey(LendDetail record);
}