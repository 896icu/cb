package cn.bdqn.controller.sys;

import cn.bdqn.model.*;
import cn.bdqn.service.balancepayment.BalancePaymentService;
import cn.bdqn.service.burole.BuRoleService;
import cn.bdqn.service.buser.BackendUserService;
import cn.bdqn.service.employee.EmployeeService;
import cn.bdqn.service.extension.ExtensionService;
import cn.bdqn.service.institutions.InstitutionsService;
import cn.bdqn.service.menu.MenuService;
import cn.bdqn.service.product.ProducttypeService;
import cn.bdqn.service.role.RoleService;
import cn.bdqn.service.sms.SmsService;
import cn.bdqn.service.transaction.TransactionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping("/sys")
public class SysController {
    @Autowired
    private InstitutionsService institutionsService;
    @Autowired
    private BalancePaymentService balancePaymentService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private SmsService smsService;
    @Autowired
    private BackendUserService backendUserService;
    @Autowired
    private ExtensionService extensionService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private BuRoleService buRoleService;
    @Autowired
    private ProducttypeService producttypeService;
    @Autowired
    private TransactionTypeService transactionTypeService;
    @Autowired
    private MenuService menuService;
    @RequestMapping(value = "/organ",method = RequestMethod.POST)
    public Map<String,Object> getInstitutionByPage(
            @RequestParam(defaultValue = "1")Integer page,
            @RequestParam(defaultValue = "10")Integer size){
        Map<String,Object> map=new HashMap<>();
        List<Institutions> institutionsList=institutionsService.selectAll(page,size);
        List<Producttype> producttypeList=producttypeService.selectAll();
        Long count=institutionsService.count();
        map.put("institutions",institutionsList);
        map.put("producttypeList",producttypeList);
        map.put("count",count);
        return map;
    }
    @RequestMapping(value = "/balancepayment",method = RequestMethod.POST)
    public Map<String,Object> getBalancePaymentByPage(
            @RequestParam(defaultValue = "1")Integer page,
            @RequestParam(defaultValue = "10")Integer size,
            Integer typeId, String startBeginDate, String endBeginDate) throws ParseException {
        Map<String,Object> map=new HashMap<>();
        List<BalancePayment> balancePaymentList=balancePaymentService.getBalancePaymentByPage(page,size,typeId,startBeginDate,endBeginDate);
        Long count=balancePaymentService.count(typeId,startBeginDate,endBeginDate);
        List<TransactionType> transactionTypeList=transactionTypeService.selectAll();
        map.put("balancepayments",balancePaymentList);
        map.put("transactionTypeList",transactionTypeList);
        map.put("count",count);
        return map;
    }
    @RequestMapping(value = "/selectEmp",method = RequestMethod.POST)
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
    @RequestMapping(value = "addEmp",method = RequestMethod.POST)
    public RespBean addEmp(Employee employee) throws Exception {
        employee.setStatus("0");
        if(employeeService.insert(employee)){
            smsService.send(employee.getPhone(),"1");
            return RespBean.ok("添加成功");
        }
        return RespBean.error("添加失败");
    }
    @RequestMapping(value = "updateEmp",method = RequestMethod.POST)
    public RespBean updateEmp(Employee employee) throws Exception {
        if(employeeService.updateByPrimaryKeySelective(employee)){
            return RespBean.ok("修改成功");
        }
        return RespBean.error("修改失败");
    }
    @RequestMapping(value = "toAddEmp",method = RequestMethod.GET)
    public Map<String,Object> toAddEmp() throws Exception {
        Map<String,Object> map=new HashMap<>();
        List<BackendUser> backendUserList=backendUserService.backendUserList();
        map.put("backendUserList",backendUserList);
        return map;
    }
    @RequestMapping(value = "toUpdateEmp",method = RequestMethod.GET)
    public Map<String,Object> toUpdateEmp(Integer id) throws Exception {
       Map<String,Object> map=new HashMap<>();
       Employee employee=employeeService.selectByPrimaryKey(id);
       List<BackendUser> backendUserList=backendUserService.backendUserList();
       map.put("backendUserList",backendUserList);
       map.put("emp",employee);
       return map;
    }
    @RequestMapping(value = "updateStatus",method = RequestMethod.GET)
    public RespBean updateStatus(Integer id){
        if(employeeService.updateStatus(id)){
            return RespBean.ok("修改状态成功");
        }
        return RespBean.error("修改状态失败");
    }
    @RequestMapping(value = "selectOne",method = RequestMethod.POST)
    public Map<String,Object> getHrById(Integer id){
        Map<String,Object> map=new HashMap<>();
        List<BackendUser> backendUserList=new ArrayList<>();
        BackendUser backendUser=backendUserService.selectById(id);
        backendUserList.add(backendUser);
        map.put("backendUserList",backendUserList);
        return map;
    }
    @RequestMapping(value = "selectAll",method = RequestMethod.GET)
    public Map<String,Object> getAllHr(Integer id){
        Map<String,Object> map=new HashMap<>();
        List<BackendUser> backendUserList=backendUserService.backendUserList();
        Long count=backendUserService.count();
        map.put("backendUserList",backendUserList);
        map.put("count",count);
        return map;
    }
    @RequestMapping(value = "extension",method = RequestMethod.GET)
    public Map<String,Object> getExtension(){
        Map<String,Object> map=new HashMap<>();
        List<Extension> extensionList=new ArrayList<>();
        Extension extension=extensionService.selectByPrimaryKey(1);
        extensionList.add(extension);
        map.put("extensionList",extensionList);
        return map;
    }
    @RequestMapping(value = "selectAllRole",method = RequestMethod.POST)
    public Map<String,Object> selectAllRole(){
        Map<String,Object> map=new HashMap<>();
        List<Role> roleList=roleService.selectAll();
        Long count=roleService.count();
        map.put("roleList",roleList);
        map.put("count",count);
        return map;
    }
    @RequestMapping(value = "addRole",method = RequestMethod.POST)
    public RespBean addRole(Role role){
        role.setCreateDate(new Date());
        role.setBuId(3);
        role.setStatus("0");
        if(roleService.insert(role)>0){
            return RespBean.ok("添加角色成功！");
        }
        return RespBean.error("添加角色失败！");
    }
    @RequestMapping(value = "updateRole",method = RequestMethod.POST)
    public RespBean updateRole(BuRole buRole){
        if(buRoleService.insert(buRole)>0){
            return RespBean.ok("修改角色成功！");
        }
        return RespBean.error("修改角色失败！");
    }
    @RequestMapping(value = "toUpdateRole",method = RequestMethod.GET)
    public Map<String,Object> toUpdateRole(Integer id){
        Map<String,Object> map=new HashMap<>();
        BackendUser backendUser=backendUserService.selectById(id);
        List<Role> roleList=roleService.selectAll();
        map.put("roleList",roleList);
        map.put("backendUser",backendUser);
        return map;
    }
    @RequestMapping(value = "toAddRole",method = RequestMethod.GET)
    public Map<String,Object> toAddRole(Integer id){
        Map<String,Object> map=new HashMap<>();
        List<Menu> menuList=menuService.selectAll();
        map.put("menuList",menuList);
        return map;
    }
}
