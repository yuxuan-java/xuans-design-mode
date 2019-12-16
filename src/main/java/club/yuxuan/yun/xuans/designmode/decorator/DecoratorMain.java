package club.yuxuan.yun.xuans.designmode.decorator;
/**
 * 装饰模式
 *      动态地给一个对象添加一些额外的职责
 *      就增加功能来说，装饰模式比生成子类更为灵活。
 *
 * @author yuxuan.han
 * @date 2019/12/8 20:25
 **/
public class DecoratorMain {

    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB();
        
        decoratorA.setComponent(decoratorB);
        decoratorB.setComponent(concreteComponent);
        
        decoratorA.operation();

        System.out.println("------done------");
    }
    
}
