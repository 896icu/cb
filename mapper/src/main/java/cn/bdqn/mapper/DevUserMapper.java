package cn.bdqn.mapper;

import cn.bdqn.model.DevUser;

public interface DevUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DevUser record);

    int insertSelective(DevUser record);

    DevUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DevUser record);

    int updateByPrimaryKey(DevUser record);
}