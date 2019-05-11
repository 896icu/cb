package cn.bdqn.mapper;

import cn.bdqn.model.BackendUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BackendUserMapper {
    BackendUser selectById(Integer id);
    List<BackendUser> backendUserList();
    int deleteByPrimaryKey(Integer id);
    Long count();
    int insert(BackendUser record);

    int insertSelective(BackendUser record);

    int updateByPrimaryKeySelective(BackendUser record);

    int updateByPrimaryKey(BackendUser record);
}