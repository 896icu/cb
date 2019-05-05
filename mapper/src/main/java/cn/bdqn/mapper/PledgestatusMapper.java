package cn.bdqn.mapper;

import cn.bdqn.model.Pledgestatus;

public interface PledgestatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pledgestatus record);

    int insertSelective(Pledgestatus record);

    Pledgestatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pledgestatus record);

    int updateByPrimaryKey(Pledgestatus record);
}