package cn.bdqn.mapper;

import cn.bdqn.model.Materials;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MaterialsMapper {
    List<Materials> selectAll();
    int deleteByPrimaryKey(Integer id);

    int insert(Materials record);

    int insertSelective(Materials record);

    Materials selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Materials record);

    int updateByPrimaryKey(Materials record);
}