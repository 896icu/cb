package cn.bdqn.customer;

import cn.bdqn.mapper.MaterialsMapper;
import cn.bdqn.model.*;
import cn.bdqn.service.devuser.DevUserService;
import cn.bdqn.service.institutions.InstitutionsService;
import cn.bdqn.service.material.MaterialsService;
import cn.bdqn.service.pledge.PledgeService;
import cn.bdqn.service.pledge.PledgestatusService;
import cn.bdqn.service.product.ProducttypeService;
import cn.bdqn.service.visit.VisitMethodService;
import cn.bdqn.service.visit.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private VisitService visitService;
    @Autowired
    private VisitMethodService visitMethodService;
    @Autowired
    private MaterialsService materialsService;
    @Autowired
    private PledgeService pledgeService;
    @Autowired
    private InstitutionsService institutionsService;
    @Autowired
    private ProducttypeService producttypeService;
    @Autowired
    private PledgestatusService pledgestatusService;
    @Autowired
    private DevUserService devUserService;
    @RequestMapping(value = "/visit",method = RequestMethod.GET)
    public Map<String,Object> getVisit(
            @RequestParam(defaultValue = "1")Integer page,
            @RequestParam(defaultValue = "10")Integer size,
            String createDate,String keyword) throws ParseException {
        Map<String,Object> map=new HashMap<>();
        List<Visit> visitList=visitService.selectByName(keyword, createDate, page, size);
        Long count=visitService.count(keyword, createDate);
        map.put("visitList",visitList);
        map.put("count",count);
        return map;
    }
    @RequestMapping(value = "getVisit",method = RequestMethod.GET)
    public Map<String,Object> getVisit(Integer id) throws Exception {
        Map<String,Object> map=new HashMap<>();
        Visit visit=visitService.selectByPrimaryKey(id);
        map.put("visit",visit);
        return map;
    }

    /**
     * 点评
     * @param visit
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "addComment",method = RequestMethod.POST)
        public RespBean addComment(Visit visit) throws Exception {
        visit.setDemohour(new Date());
        visit.setCommentators("系统管理员");
        if(visitService.addComment(visit)){
           return RespBean.ok("点评成功！！！");
        }
        return RespBean.error("点评失败！！！");
    }
    @RequestMapping(value = "toAddVisit",method = RequestMethod.GET)
    public Map<String,Object> toAddVisit() throws Exception {
        Map<String,Object> map=new HashMap<>();
        List<VisitMethod> visitMethodList=visitMethodService.selectAll();
        map.put("visitMethodList",visitMethodList);
        return map;
    }
    @RequestMapping(value = "addVisit",method = RequestMethod.POST)
    public RespBean addVisit(Visit visit) throws Exception {
        visit.setCreateDate(new Date());
        if(visitService.insert(visit)){
            return RespBean.ok("添加成功");
        }
        return RespBean.error("添加失败");
    }
    @RequestMapping(value = "toUpdateVisit",method = RequestMethod.GET)
    public Map<String,Object> toUpdateVisit(Integer id) throws Exception {
        Map<String,Object> map=new HashMap<>();
        Visit visit=visitService.selectByPrimaryKey(id);
        List<VisitMethod> visitMethodList=visitMethodService.selectAll();
        map.put("visitMethodList",visitMethodList);
        map.put("visit",visit);
        return map;
    }
    @RequestMapping(value = "updateVisit",method = RequestMethod.POST)
    public RespBean toUpdateVisit(Visit visit) throws Exception {
        if(visitService.updateByPrimaryKeySelective(visit)){
            return RespBean.ok("修改成功");
        }
        return RespBean.error("修改失败");
    }
    @RequestMapping(value = "deleteVisit",method = RequestMethod.GET)
    public RespBean deleteVisit(Integer id) throws Exception {
        if(visitService.deleteByPrimaryKey(id)){
            return RespBean.ok("删除成功");
        }
        return RespBean.error("删除失败");
    }
    @RequestMapping(value = "/materials",method = RequestMethod.GET)
    public Map<String,Object> getMaterials(
            @RequestParam(defaultValue = "1")Integer page,
            @RequestParam(defaultValue = "10")Integer size,
            String createDate,String keyword) throws ParseException {
        Map<String,Object> map=new HashMap<>();
        List<Materials> materialsList=materialsService.selectAll(keyword, createDate, page, size);
        Long count=materialsService.count(keyword,createDate);
        map.put("materialsList",materialsList);
        map.put("count",count);
        return map;
    }
    @RequestMapping(value = "/pledge",method = RequestMethod.GET)
    public Map<String,Object> getPledge(
            @RequestParam(defaultValue = "1")Integer page,
            @RequestParam(defaultValue = "10")Integer size,
            String createDate,String keyword) throws ParseException {
        Map<String,Object> map=new HashMap<>();
        List<Pledge> pledgeList=pledgeService.selectAll(keyword, createDate, page, size);
        Long count=pledgeService.count(keyword,createDate);
        map.put("pledgeList",pledgeList);
        map.put("count",count);
        return map;
    }
    @RequestMapping(value = "addPledge",method = RequestMethod.POST)
    public RespBean addPledge(Pledge pledge) throws Exception {
        pledge.setCreateDate(new Date());
        if(pledgeService.insert(pledge)){
            return RespBean.ok("添加成功");
        }
        return RespBean.error("添加失败");
    }
    @RequestMapping(value = "toAddPledge",method = RequestMethod.GET)
    public Map<String,Object> toAddPledge() throws Exception {
        Map<String,Object> map=new HashMap<>();
        List<Institutions> institutionsList=institutionsService.selectAll(1,10);
        List<Producttype> producttypeList=producttypeService.selectAll();
        List<Pledgestatus> pledgestatusList=pledgestatusService.selectAll();
        List<DevUser> devUserList=devUserService.selectAll();
        map.put("institutionsList",institutionsList);
        map.put("producttypeList",producttypeList);
        map.put("pledgestatusList",pledgestatusList);
        map.put("devUserList",devUserList);
        return map;
    }
    @RequestMapping(value = "toUpdatePledge",method = RequestMethod.GET)
    public Map<String,Object> toUpdatePledge(Integer id) throws Exception {
        Map<String,Object> map=new HashMap<>();
        Pledge pledge=pledgeService.selectByPrimaryKey(id);
        List<Institutions> institutionsList=institutionsService.selectAll(1,10);
        List<Producttype> producttypeList=producttypeService.selectAll();
        List<Pledgestatus> pledgestatusList=pledgestatusService.selectAll();
        List<DevUser> devUserList=devUserService.selectAll();
        map.put("institutionsList",institutionsList);
        map.put("producttypeList",producttypeList);
        map.put("pledgestatusList",pledgestatusList);
        map.put("devUserList",devUserList);
        map.put("pledge",pledge);
        return map;
    }
    @RequestMapping(value = "updatePledge",method = RequestMethod.POST)
    public RespBean updatePledge(Pledge pledge) throws Exception {
        if(pledgeService.updateByPrimaryKeySelective(pledge)){
            return RespBean.ok("修改成功");
        }
        return RespBean.error("修改失败");
    }
    @RequestMapping(value = "deletePledge",method = RequestMethod.GET)
    public RespBean deletePledge(Integer id) throws Exception {
        if(pledgeService.deleteByPrimaryKey(id)){
            return RespBean.ok("删除成功");
        }
        return RespBean.error("删除失败");
    }
    @RequestMapping(value = "selectPledge",method = RequestMethod.GET)
    public Map<String,Object> selectPledge(Integer id) throws Exception {
        Map<String,Object> map=new HashMap<>();
        Pledge pledge=pledgeService.selectByPrimaryKey(id);
        map.put("pledge",pledge);
        return map;
    }
}
