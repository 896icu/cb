package cn.bdqn.mapper;

import cn.bdqn.model.BuRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BuRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BuRole record);

    int insertSelective(BuRole record);

    BuRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BuRole record);

    int updateByPrimaryKey(BuRole record);
}