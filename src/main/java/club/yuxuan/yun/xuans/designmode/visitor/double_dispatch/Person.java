package club.yuxuan.yun.xuans.designmode.visitor.double_dispatch;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public abstract class Person {
    
    protected String action;

    /**
     * 得到结论或作出反应
     */
    public abstract void accept(Action visitor);
    
}
