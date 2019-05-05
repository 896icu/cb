package cn.bdqn.mapper;

import cn.bdqn.model.Materials;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface MaterialsMapper {
    List<Materials> selectAll(@Param("keyword")String keyword,
                              @Param("createDate")String createDate,
                              @Param("page")Integer page,
                              @Param("size")Integer size);
    Long count(@Param("keyword")String keyword,
                              @Param("createDate")String createDate);
    int deleteByPrimaryKey(Integer id);

    int insert(Materials record);

    int insertSelective(Materials record);

    Materials selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Materials record);

    int updateByPrimaryKey(Materials record);
}