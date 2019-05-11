package cn.bdqn.service.balancepayment;

import cn.bdqn.mapper.BalancePaymentMapper;
import cn.bdqn.model.BalancePayment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Service
@Transactional
public class BalancePaymentService {
    @Resource
    private BalancePaymentMapper balancePaymentMapper;
    SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
    SimpleDateFormat birthdayFormat = new SimpleDateFormat("yyyy-MM-dd");
    DecimalFormat decimalFormat = new DecimalFormat("##.00");
    public List<BalancePayment> getBalancePaymentByPage(Integer start, Integer size, Integer typeId, String startBeginDate,
                                                  String endBeginDate) throws ParseException {
        Date startDate=null;
        Date endDate=null;
        if (startBeginDate != null && startBeginDate!=""){
            startDate=birthdayFormat.parse(startBeginDate);
        }
        if (endBeginDate != null && endBeginDate!=""){
            endDate=birthdayFormat.parse(endBeginDate);
        }
        return balancePaymentMapper.getBalancePaymentByPage((start-1)*size,size,typeId,startDate,endDate);
    }
    public Long count(Integer typeId,String startBeginDate,String endBeginDate) throws ParseException {
        Date startDate=null;
        Date endDate=null;
        if (startBeginDate != null && startBeginDate!=""){
            startDate=birthdayFormat.parse(startBeginDate);
        }
        if (endBeginDate != null && endBeginDate!=""){
            endDate=birthdayFormat.parse(endBeginDate);
        }
        return balancePaymentMapper.count(typeId,startDate,endDate);
    }
    public int insert(BalancePayment record){
        return balancePaymentMapper.insert(record);
    }
}