package cn.bdqn.service.visit;

import cn.bdqn.mapper.VisitMethodMapper;
import cn.bdqn.model.VisitMethod;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class VisitMethodService {
    @Resource
    private VisitMethodMapper visitMethodMapper;
    public List<VisitMethod> selectAll(){
        return visitMethodMapper.selectAll();
    }
}