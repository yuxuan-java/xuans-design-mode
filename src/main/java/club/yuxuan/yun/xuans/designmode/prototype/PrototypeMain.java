package club.yuxuan.yun.xuans.designmode.prototype;

/**
 * 原型模式: Object类就自带clone()方法 -> 浅拷贝
 *      用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 *      原型模式其实就是从一个对象再创建另一个可定制的对象，而且不需知道任何创建的细节。
 *      
 *      一般在初始化信息不发生变化的情况下，克隆是最好的办法。
 *      这既隐藏了对象创建的细节，又对性能大大提高。
 *
 * @author yuxuan.han
 * @date 2019/12/16 23:49
 **/
public class PrototypeMain {

    public static void main(String[] args) {
        ConcretePrototype1 p1 = new ConcretePrototype1("id");
        ConcretePrototype1 c1 = (ConcretePrototype1) p1.clone();
        System.out.println(c1.getId());

        System.out.println("------done------");
    }
    
}
