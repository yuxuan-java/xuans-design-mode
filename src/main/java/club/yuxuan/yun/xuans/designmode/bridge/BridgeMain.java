package club.yuxuan.yun.xuans.designmode.bridge;

/**
 * 桥接模式
 *      将抽象部分与它的实现部分分离，使它们都可以独立地变化。
 *      
 *      抽象与它的实现分离并不是说让抽象类与其派生类分离，因为这没有任何意义。
 *      实现指的是抽象类和它的派生类用来实现自己的对象。
 *      
 *      换一种方式理解：
 *          实现系统可能有多角度分类，每一种分类都有可能变化，那么就把这种多角度分离出来让它们变化，减少它们之间的耦合。
 *          
 *      只要真正深入地理解了设计原则，很多设计模式其实就是对原则的应用而已，或许在不知不觉中就在使用设计模式了。
 *
 * @author yuxuan.han
 * @date 2019/12/24 23:27
 **/
public class BridgeMain {

    public static void main(String[] args) {
        Abstraction abs = new RefinedAbstraction();
        
        abs.setImplementor(new ConcreteImplementorA());
        abs.operation();

        System.out.println();
        
        abs.setImplementor(new ConcreteImplementorB());
        abs.operation();

        System.out.println("------done------");
    }
    
}
