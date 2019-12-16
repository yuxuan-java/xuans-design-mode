package club.yuxuan.yun.xuans.designmode.factory.simple;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 运算类
 *
 * @author yuxuan.han
 * @date 2019/12/16 22:24
 **/
@Data
public abstract class Operation {
    
    protected BigDecimal numberA = BigDecimal.ZERO;

    protected BigDecimal numberB = BigDecimal.ZERO;
    
    public abstract BigDecimal getResult();
    
}
