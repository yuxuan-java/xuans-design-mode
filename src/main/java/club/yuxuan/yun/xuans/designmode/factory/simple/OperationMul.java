package club.yuxuan.yun.xuans.designmode.factory.simple;

import java.math.BigDecimal;

/**
 * 乘法
 *
 * @author yuxuan.han
 * @date 2019/12/16 22:28
 **/
public class OperationMul extends Operation {
    
    @Override
    public BigDecimal getResult() {
        return numberA.multiply(numberB);
    }
    
}
