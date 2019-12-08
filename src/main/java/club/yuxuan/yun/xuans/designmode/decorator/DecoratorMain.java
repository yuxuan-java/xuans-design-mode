package club.yuxuan.yun.xuans.designmode.decorator;
/**
 * 装饰模式测试类
 *
 * @author yuxuan.han
 * @date 2019/12/8 22:03
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
