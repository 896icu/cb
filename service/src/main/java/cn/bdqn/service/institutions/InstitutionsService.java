package cn.bdqn.service.institutions;

import cn.bdqn.mapper.InstitutionsMapper;
import cn.bdqn.model.Institutions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class InstitutionsService {
    @Resource
    private InstitutionsMapper institutionsMapper;
    public List<Institutions> selectAll(Integer start, Integer size){
        return institutionsMapper.selectAll((start-1)*size,size);
    }
    public Long count(){
        return institutionsMapper.count();
    }
    public Institutions selectByPrimaryKey(Integer id){
        return institutionsMapper.selectByPrimaryKey(id);
    }
    public int updateMoney(){
        return institutionsMapper.updateMoney();
    }
}