package club.yuxuan.yun.xuans.designmode.decorator;
/**
 * 装饰模式
 *      动态地给一个对象添加一些额外的职责
 *      就增加功能来说，装饰模式比生成子类更为灵活。
 *      
 *      Component定义一个对象接口，可以给这些对象动态地添加职责。
 *      ConcreteComponent是定义了一个具体的对象，也可以给这个对象添加一些职责。
 *      Decorator装饰抽象类，继承了Component从外类来扩展Component类的功能，
 *          但对于Component来说，是无需知道Decorator的存在的。
 *      至于ConcreteDecorator就是具体的装饰对象，起到给Component添加职责的功能。
 *
 *      
 *      装饰模式是为已有功能动态地添加更多功能的一种方式。
 *      它把每个要装饰的功能放在单独的类中，并让这个类包装它所要装饰的对象，
 *          因此，当需要执行特殊行为时，客户代码就可以在运行时根据需要有选择地、按顺序地使用装饰功能包装对象了[DP]。
 *      把类中的装饰功能从类中搬移去除，这样可以简化原有的类，有效地把类的核心职责和装饰功能区分开了。
 *      而且可以去除相关类中重复的装饰逻辑。
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
