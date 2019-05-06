package cn.bdqn.mapper;

import cn.bdqn.model.Producttype;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProducttypeMapper {
    List<Producttype> selectAll();
    int deleteByPrimaryKey(Integer id);

    int insert(Producttype record);

    int insertSelective(Producttype record);

    Producttype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Producttype record);

    int updateByPrimaryKey(Producttype record);
}