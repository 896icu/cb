package cn.bdqn.controller.sys;

import cn.bdqn.model.BalancePayment;
import cn.bdqn.model.Employee;
import cn.bdqn.model.Institutions;
import cn.bdqn.service.balancepayment.BalancePaymentService;
import cn.bdqn.service.employee.EmployeeService;
import cn.bdqn.service.institutions.InstitutionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/sys")
public class SysController {
    @Autowired
    private InstitutionsService institutionsService;
    @Autowired
    private BalancePaymentService balancePaymentService;
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping(value = "/organ",method = RequestMethod.GET)
    public Map<String,Object> getInstitutionByPage(
            @RequestParam(defaultValue = "1")Integer page,
            @RequestParam(defaultValue = "10")Integer size){
        Map<String,Object> map=new HashMap<>();
        List<Institutions> institutionsList=institutionsService.selectAll(page,size);
        Long count=institutionsService.count();
        map.put("institutions",institutionsList);
        map.put("count",count);
        return map;
    }
    @RequestMapping(value = "/balancepayment",method = RequestMethod.GET)
    public Map<String,Object> getBalancePaymentByPage(
            @RequestParam(defaultValue = "1")Integer page,
            @RequestParam(defaultValue = "10")Integer size,
            Integer typeId, String startBeginDate, String endBeginDate) throws ParseException {
        Map<String,Object> map=new HashMap<>();
        List<BalancePayment> balancePaymentList=balancePaymentService.getBalancePaymentByPage(page,size,typeId,startBeginDate,endBeginDate);
        Long count=balancePaymentService.count(typeId,startBeginDate,endBeginDate);
        map.put("balancepayments",balancePaymentList);
        map.put("count",count);
        return map;
    }
    @RequestMapping(value = "/emp",method = RequestMethod.GET)
    public Map<String,Object> getEmployeeByPage(@RequestParam(defaultValue = "1")Integer page,
                                                @RequestParam(defaultValue = "10")Integer size,
                                                @RequestParam(defaultValue = "")String keywords){
        Map<String,Object>  map=new HashMap<>();
        List<Employee> employeeList=employeeService.getEmployeeByPage(page,size,keywords);
        Long count=employeeService.count(keywords);
        map.put("emps",employeeList);
        map.put("count",count);
        return map;
    }
}
