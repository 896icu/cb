package cn.bdqn.mapper;

import cn.bdqn.model.Extension;

public interface ExtensionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Extension record);

    int insertSelective(Extension record);

    Extension selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Extension record);

    int updateByPrimaryKey(Extension record);
}