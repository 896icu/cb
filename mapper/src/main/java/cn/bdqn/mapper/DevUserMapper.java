package cn.bdqn.mapper;

import cn.bdqn.model.DevUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DevUserMapper {
    List<DevUser> selectAll();
    int deleteByPrimaryKey(Integer id);

    int insert(DevUser record);

    int insertSelective(DevUser record);

    DevUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DevUser record);

    int updateByPrimaryKey(DevUser record);
}