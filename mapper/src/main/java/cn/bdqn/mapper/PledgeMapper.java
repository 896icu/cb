package cn.bdqn.mapper;

import cn.bdqn.model.Pledge;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PledgeMapper {
    List<Pledge> selectAll(@Param("keyword")String keyword,
                           @Param("createDate")String createDate,
                           @Param("page")Integer page,
                           @Param("size")Integer size);
    Long count(@Param("keyword")String keyword,
                           @Param("createDate")String createDate);
    int deleteByPrimaryKey(Integer id);

    int insert(Pledge record);

    int insertSelective(Pledge record);

    Pledge selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pledge record);

    int updateByPrimaryKey(Pledge record);
}