package cn.bdqn.mapper;

import cn.bdqn.model.TransactionType;

public interface TransactionTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TransactionType record);

    int insertSelective(TransactionType record);

    TransactionType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TransactionType record);

    int updateByPrimaryKey(TransactionType record);
}