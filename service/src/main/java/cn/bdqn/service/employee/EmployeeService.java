package cn.bdqn.service.employee;

import cn.bdqn.mapper.EmployeeMapper;
import cn.bdqn.model.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class EmployeeService {
    @Resource
    private EmployeeMapper employeeMapper;
    public List<Employee> getEmployeeByPage(Integer start,Integer size,String keywords){
        return employeeMapper.getEmployeeByPage((start-1)*size,size,keywords);
    }
    public Long count(String keywords){
        return employeeMapper.count(keywords);
    }
}
