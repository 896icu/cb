package cn.bdqn.mapper;

import cn.bdqn.model.Decision;

public interface DecisionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Decision record);

    int insertSelective(Decision record);

    Decision selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Decision record);

    int updateByPrimaryKey(Decision record);
}