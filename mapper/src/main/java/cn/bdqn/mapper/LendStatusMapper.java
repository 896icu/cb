package cn.bdqn.mapper;

import cn.bdqn.model.LendStatus;

public interface LendStatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LendStatus record);

    int insertSelective(LendStatus record);

    LendStatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LendStatus record);

    int updateByPrimaryKey(LendStatus record);
}