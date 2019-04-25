package cn.bdqn.mapper;

import cn.bdqn.model.BackendUser;

public interface BackendUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BackendUser record);

    int insertSelective(BackendUser record);

    BackendUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BackendUser record);

    int updateByPrimaryKey(BackendUser record);
}