package cn.bdqn.mapper;

import cn.bdqn.model.Pledgetype;

public interface PledgetypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pledgetype record);

    int insertSelective(Pledgetype record);

    Pledgetype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pledgetype record);

    int updateByPrimaryKey(Pledgetype record);
}