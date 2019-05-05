package cn.bdqn.mapper;

import cn.bdqn.model.Visit;
import cn.bdqn.model.VisitMethod;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
@Mapper
public interface VisitMethodMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VisitMethod record);
    List<VisitMethod> selectAll();
    int insertSelective(VisitMethod record);
    VisitMethod selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VisitMethod record);

    int updateByPrimaryKey(VisitMethod record);
}