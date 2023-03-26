package club.yuxuan.yun.xuans.designmode.visitor.double_dispatch;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description 人-基础类
 *
 * @author yuxuan.han
 * @date 2023/3/26
 **/
@Data
@EqualsAndHashCode
public abstract class BasePerson {
    
    protected String action;

    /**
     * 得到结论或作出反应
     */
    public abstract void accept(BaseAction visitor);
    
}
