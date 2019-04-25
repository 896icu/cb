package cn.bdqn.mapper;

import cn.bdqn.model.IntoManagement;

public interface IntoManagementMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IntoManagement record);

    int insertSelective(IntoManagement record);

    IntoManagement selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IntoManagement record);

    int updateByPrimaryKey(IntoManagement record);
}