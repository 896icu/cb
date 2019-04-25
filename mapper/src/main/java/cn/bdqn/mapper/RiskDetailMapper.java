package cn.bdqn.mapper;

import cn.bdqn.model.RiskDetail;

public interface RiskDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RiskDetail record);

    int insertSelective(RiskDetail record);

    RiskDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RiskDetail record);

    int updateByPrimaryKey(RiskDetail record);
}