package cn.bdqn.mapper;

import cn.bdqn.model.Institutions;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface InstitutionsMapper {
    List<Institutions> selectAll(@Param("start") Integer start,
                                 @Param("size") Integer size);
    Long count();
    int deleteByPrimaryKey(Integer id);

    int insert(Institutions record);

    int insertSelective(Institutions record);

    Institutions selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Institutions record);

    int updateByPrimaryKey(Institutions record);
}