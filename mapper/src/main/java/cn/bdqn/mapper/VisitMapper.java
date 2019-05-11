package cn.bdqn.mapper;

import cn.bdqn.model.Visit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface VisitMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Visit record);
    List<Visit> selectByName(@Param("keyword")String keyword,
                             @Param("createDate") String createDate,
                             @Param("page")Integer page,
                             @Param("size")Integer size);
    Long count(@Param("keyword")String keyword,
              @Param("createDate")String createDate);
    int insertSelective(Visit record);

    Visit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Visit record);
    int addComment(Visit visit);
    int updateByPrimaryKey(Visit record);
    String number(Integer id);
}