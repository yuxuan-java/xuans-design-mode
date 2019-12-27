package club.yuxuan.yun.xuans.designmode.flyweight;

/**
 * 非共享享元对象
 *
 * @author yuxuan.han
 * @date 2019/12/27 22:50
 **/
public class UnsharedConcreteFlyweight extends Flyweight {

    @Override
    public void operation(String extrinsicState) {
        System.out.println("UnsharedConcreteFlyweight_" + this + ": " + extrinsicState);
    }
    
}
