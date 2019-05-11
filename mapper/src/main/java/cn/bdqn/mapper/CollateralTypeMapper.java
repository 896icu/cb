package cn.bdqn.mapper;

import cn.bdqn.model.CollateralType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CollateralTypeMapper {
    List<CollateralType> selectAll();
    int deleteByPrimaryKey(Integer id);

    int insert(CollateralType record);

    int insertSelective(CollateralType record);

    CollateralType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CollateralType record);

    int updateByPrimaryKey(CollateralType record);
}