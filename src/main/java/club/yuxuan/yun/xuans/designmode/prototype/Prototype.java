package club.yuxuan.yun.xuans.designmode.prototype;

import lombok.Data;

/**
 * 原型类
 *
 * @author yuxuan.han
 * @date 2019/12/16 23:50
 **/
@Data
public abstract class Prototype {
    
    private String id;

    public Prototype(String id) {
        this.id = id;
    }
    
    public abstract Prototype clone();
    
}
