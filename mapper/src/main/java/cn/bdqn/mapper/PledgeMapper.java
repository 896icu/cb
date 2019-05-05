package cn.bdqn.mapper;

import cn.bdqn.model.Pledge;

public interface PledgeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pledge record);

    int insertSelective(Pledge record);

    Pledge selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pledge record);

    int updateByPrimaryKey(Pledge record);
}