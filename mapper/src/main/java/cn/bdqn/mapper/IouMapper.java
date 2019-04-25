package cn.bdqn.mapper;

import cn.bdqn.model.Iou;

public interface IouMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Iou record);

    int insertSelective(Iou record);

    Iou selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Iou record);

    int updateByPrimaryKey(Iou record);
}