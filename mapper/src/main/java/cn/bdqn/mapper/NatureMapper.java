package cn.bdqn.mapper;

import cn.bdqn.model.Nature;

public interface NatureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Nature record);

    int insertSelective(Nature record);

    Nature selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Nature record);

    int updateByPrimaryKey(Nature record);
}