package cn.bdqn.mapper;

import cn.bdqn.model.Extension;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExtensionMapper {
    int deleteByPrimaryKey(Integer id);
    List<Extension> selectAll();
    int insert(Extension record);

    int insertSelective(Extension record);

    Extension selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Extension record);

    int updateByPrimaryKey(Extension record);
}