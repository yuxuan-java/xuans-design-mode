package club.yuxuan.yun.xuans.designmode.factory.simple;

import java.math.BigDecimal;

/**
 * 除法
 *
 * @author yuxuan.han
 * @date 2019/12/16 22:29
 **/
public class OperationDiv extends BaseOperation {
    
    @Override
    public BigDecimal getResult() {
        if (BigDecimal.ZERO.equals(numberB)) {
            throw new IllegalArgumentException("'0'不能作为被除数.");
        }
        
        return numberA.divide(numberB);
    }
    
}
