package cn.bdqn.mapper;

import cn.bdqn.model.TransactionType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TransactionTypeMapper {
    int deleteByPrimaryKey(Integer id);
    List<TransactionType> selectAll();
    int insert(TransactionType record);

    int insertSelective(TransactionType record);

    TransactionType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TransactionType record);

    int updateByPrimaryKey(TransactionType record);
}