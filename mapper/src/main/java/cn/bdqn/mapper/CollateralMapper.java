package cn.bdqn.mapper;

import cn.bdqn.model.Collateral;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CollateralMapper {
    List<Collateral> selectByName(@Param("keyword")String keyword,
                                  @Param("createDate")String createDate,
                                  @Param("page")Integer page,
                                  @Param("size")Integer size);
    Long count(@Param("keyword")String keyword,
                                  @Param("createDate")String createDate);
    int deleteByPrimaryKey(Integer id);

    int insert(Collateral record);

    int insertSelective(Collateral record);

    Collateral selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Collateral record);

    int updateByPrimaryKey(Collateral record);
}