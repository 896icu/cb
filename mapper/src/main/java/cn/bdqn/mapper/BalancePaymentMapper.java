package cn.bdqn.mapper;

import cn.bdqn.model.BalancePayment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
@Mapper
public interface BalancePaymentMapper {
    List<BalancePayment> getBalancePaymentByPage(@Param("start") Integer start,
                                                 @Param("size") Integer size,
                                                 @Param("typeId") Integer typeId,
                                                 @Param("startBeginDate") Date startBeginDate,
                                                 @Param("endBeginDate") Date endBeginDate);
    Long count(@Param("typeId") Integer typeId,
              @Param("startBeginDate") Date startBeginDate,
              @Param("endBeginDate") Date endBeginDate);
    int deleteByPrimaryKey(Integer id);

    int insert(BalancePayment record);

    int insertSelective(BalancePayment record);

    BalancePayment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BalancePayment record);

    int updateByPrimaryKey(BalancePayment record);
}