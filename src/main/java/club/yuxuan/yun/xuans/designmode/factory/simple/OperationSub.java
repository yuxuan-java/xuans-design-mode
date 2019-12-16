package club.yuxuan.yun.xuans.designmode.factory.simple;

import java.math.BigDecimal;

/**
 * 减法
 *
 * @author yuxuan.han
 * @date 2019/12/16 22:27
 **/
public class OperationSub extends Operation {
    
    @Override
    public BigDecimal getResult() {
        return numberA.subtract(numberB);
    }
    
}
