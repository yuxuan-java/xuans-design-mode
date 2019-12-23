package club.yuxuan.yun.xuans.designmode.state;

/**
 * 状态模式
 *      当一个对象的内在状态改变时，允许改变其行为，这个对象看起来像是改变了其类。
 *      
 *      面向对象设计其实就是希望做到代码的责任分解。
 *      
 *      状态模式主要解决的是当控制一个对象状态转换的条件表达式过于复杂时的情况。
 *      把状态的判断逻辑转移到表示不同的一系列类当中，可以把复杂的判断逻辑简单化。
 *      
 *      状态模式的好处是将于特定状态相关的行为局部化，并且将不同状态的行为分隔开来。
 *      将特定的状态相关的行为都放入一个对象中，犹豫所有与状态相关的代码都存在于某个ConcreteState中，
 *          所以通过定义新的子类就可以很容易地增加新的状态和转换，这样做的目的就是为了消除庞大的条件分支语句。
 *      状态欧式通过吧各种状态转移逻辑分部到State的子类之间，来减少相互间的依赖。
 *      
 *      当一个对象的行为取决于它的状态，并且它必须在运行时刻根据状态改变它的行为时，就可以考虑使用状态模式了。
 *
 * @author yuxuan.han
 * @date 2019/12/15 18:10
 **/
public class StateMain {

    public static void main(String[] args) {
        StateContext c = new StateContext(new ConcreteStateA());
        c.request();
        c.request();
        c.request();
        c.request();

        System.out.println("------done------");
    }
    
}
