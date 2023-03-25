package club.yuxuan.yun.xuans.designmode.factory.simple;

import java.math.BigDecimal;

/**
 * 加法
 *
 * @author yuxuan.han
 * @date 2019/12/16 22:26
 **/
public class OperationAdd extends BaseOperation {
    
    @Override
    public BigDecimal getResult() {
        return numberA.add(numberB);
    }
    
}
