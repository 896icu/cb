package cn.bdqn.mapper;

import cn.bdqn.model.Iou;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface IouMapper {
    List<Iou> getIouByPage(@Param("keywords")String keywords,
                           @Param("startDate")Date startDate,
                           @Param("endDate")Date endDate,
                           @Param("typeId")Integer typeId,
                           @Param("start")Integer start,
                           @Param("size")Integer size);
    Long count(@Param("keywords")String keywords,
              @Param("startDate")Date startDate,
              @Param("endDate")Date endDate,
              @Param("typeId")Integer typeId);
    int deleteByPrimaryKey(Integer id);

    int insert(Iou record);

    int insertSelective(Iou record);

    Iou selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Iou record);

    int updateByPrimaryKey(Iou record);
    int updateStatus(@Param("id") Integer id,@Param("status") Integer status);
    List<Iou> iouList(@Param("keywords")String keywords,
                      @Param("startDate")Date startDate,
                      @Param("endDate")Date endDate,
                      @Param("start")Integer start,
                      @Param("size")Integer size);
    Long iouCount(@Param("keywords")String keywords,
                      @Param("startDate")Date startDate,
                      @Param("endDate")Date endDate);
}