package cn.bdqn.service.employee;

import cn.bdqn.mapper.BalancePaymentMapper;
import cn.bdqn.mapper.EmployeeMapper;
import cn.bdqn.mapper.InstitutionsMapper;
import cn.bdqn.model.BalancePayment;
import cn.bdqn.model.Employee;
import cn.bdqn.model.Institutions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class EmployeeService {
    @Resource
    private EmployeeMapper employeeMapper;
    @Resource
    private InstitutionsMapper institutionsMapper;
    @Resource
    private BalancePaymentMapper balancePaymentMapper;
    public List<Employee> getEmployeeByPage(Integer start,Integer size,String keywords){
        return employeeMapper.getEmployeeByPage((start-1)*size,size,keywords);
    }
    public Long count(String keywords){
        return employeeMapper.count(keywords);
    }
    public boolean insert(Employee record){
        int num=0;
        if(employeeMapper.insert(record)>0){
            Institutions institutions=institutionsMapper.selectByPrimaryKey(1);
            BalancePayment balancePayment=new BalancePayment();
            balancePayment.setCreateDate(new Date());
            balancePayment.setTypeId(3);
            balancePayment.setAmount(0.04);
            balancePayment.setPurpose("发送短信");
            balancePayment.setBalance(institutions.getBalance()-0.04);
            balancePayment.setOperator(record.getPhone());
            balancePayment.setNickName(record.getNickName());
            balancePayment.setAuthenticator(record.getNickName());
            balancePayment.setStatus("成功");
            balancePaymentMapper.insert(balancePayment);
            institutionsMapper.updateMoney();
            num=1;
        }
        return num>0;
    }
    public boolean updateByPrimaryKeySelective(Employee record){
        return employeeMapper.updateByPrimaryKeySelective(record)>0;
    }
    public boolean updateStatus(Integer id){
        return employeeMapper.updateStatus(id)>0;
    }
    public Employee selectByPrimaryKey(Integer id){
        return employeeMapper.selectByPrimaryKey(id);
    }
}
