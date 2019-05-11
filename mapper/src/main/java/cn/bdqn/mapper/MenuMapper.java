package cn.bdqn.mapper;

import cn.bdqn.model.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MenuMapper {
    int deleteByPrimaryKey(Integer id);
    List<Menu> selectAll();
    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}