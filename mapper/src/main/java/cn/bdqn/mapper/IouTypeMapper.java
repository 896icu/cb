package cn.bdqn.mapper;

import cn.bdqn.model.IouType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface IouTypeMapper {
    List<IouType> getAll();
    int deleteByPrimaryKey(Integer id);

    int insert(IouType record);

    int insertSelective(IouType record);

    IouType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IouType record);

    int updateByPrimaryKey(IouType record);
}