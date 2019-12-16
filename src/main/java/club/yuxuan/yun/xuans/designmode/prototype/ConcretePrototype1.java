package club.yuxuan.yun.xuans.designmode.prototype;

/**
 * 具体原型类
 *
 * @author yuxuan.han
 * @date 2019/12/16 23:52
 **/
public class ConcretePrototype1 extends Prototype {

    public ConcretePrototype1(String id) {
        super(id);
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype1(this.getId());
    }
    
}
