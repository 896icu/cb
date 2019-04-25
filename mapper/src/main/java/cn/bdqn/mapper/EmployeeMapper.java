package cn.bdqn.mapper;

import cn.bdqn.model.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface EmployeeMapper {
    List<Employee> getEmployeeByPage(@Param("start") Integer start,
                                     @Param("size") Integer size,
                                     @Param("keywords") String keywords);
    Long count(@Param("keywords") String keywords);
    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}