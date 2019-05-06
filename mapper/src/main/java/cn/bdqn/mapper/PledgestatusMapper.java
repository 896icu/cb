package cn.bdqn.mapper;

import cn.bdqn.model.Pledgestatus;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PledgestatusMapper {
    List<Pledgestatus> selectAll();
    int deleteByPrimaryKey(Integer id);

    int insert(Pledgestatus record);

    int insertSelective(Pledgestatus record);

    Pledgestatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pledgestatus record);

    int updateByPrimaryKey(Pledgestatus record);
}