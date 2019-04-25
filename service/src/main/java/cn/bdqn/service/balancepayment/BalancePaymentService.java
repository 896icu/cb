package cn.bdqn.service.balancepayment;

import cn.bdqn.mapper.BalancePaymentMapper;
import cn.bdqn.model.BalancePayment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
@Transactional
public class BalancePaymentService {
    @Resource
    private BalancePaymentMapper balancePaymentMapper;
    public List<BalancePayment> getBalancePaymentByPage(Integer start, Integer size, Integer typeId, Date startBeginDate,
                                                 Date endBeginDate){
        return balancePaymentMapper.getBalancePaymentByPage((start-1)*size,size,typeId,startBeginDate,endBeginDate);
    }
    public Long count(Integer typeId,Date startBeginDate,Date endBeginDate){
        return balancePaymentMapper.count(typeId,startBeginDate,endBeginDate);
    }
}