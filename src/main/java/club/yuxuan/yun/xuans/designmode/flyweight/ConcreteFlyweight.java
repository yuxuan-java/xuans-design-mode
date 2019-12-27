package club.yuxuan.yun.xuans.designmode.flyweight;

import lombok.Getter;

/**
 * 具体享元共享对象
 *
 * @author yuxuan.han
 * @date 2019/12/27 22:50
 **/
@Getter
public class ConcreteFlyweight extends Flyweight {
    
    private String name = "";

    public ConcreteFlyweight(String name) {
        this.name = name;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("ConcreteFlyweight_" + name + "_" + this + ": " + extrinsicState);
    }
    
}
