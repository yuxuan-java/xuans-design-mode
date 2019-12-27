package club.yuxuan.yun.xuans.designmode.mediator;

/**
 * 中介者模式
 *      用一个中介对象来封装一系列的对象交互。
 *      中介者使各对象不需要显式地相互作用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
 * 
 *      尽管将一个系统分割成许多对象通常可以增加其可复用性，但是对象间相互连接的激增又会降低其可复用性。
 *      大量的连接使得一个对象不可能在没有其他对象的支持下工作
 *      系统表现为一个不可分割的整体，所以，对系统的行为进行任何较大的改动就十分困难了。
 *      
 *      中介者模式很容易在系统中应用，也很容易在系统中误用。
 *      当系统出现了'多对多'交互复杂的对象群时，不要急于使用中介者模式，
 *      而要先反思你的系统在设计上是不是合理。
 *      
 * 优点：
 *      Mediator的出现减少了各个Colleague的耦合，使得可以独立地改变和复用各个Colleague类和Mediator类。
 *      由于把对象如何协作进行了抽象，将中介作为一个独立的概念并将其封装在一个对象中，
 *      这样关注的对象就从对象各自本身的行为转移到它们之间的交互上来，也就是站在一个更宏观的角度去看待系统。
 *      
 * 缺点：
 *      由于ConcreteMediator控制了集中化，于是就把交互复杂性变为了中介者的复杂性，
 *      这就使得中介者会变得比任何一个ConcreteColleague都复杂。
 *      
 *      中介者模式一般应用于一组对象以定义良好但是复杂的方式进行通信的场合，
 *      以及想定制一个分布在多个类中的行为，而又不想生成太多子类的场合。
 *
 * @author yuxuan.han
 * @date 2019/12/27 22:01
 **/
public class MediatorMain {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        
        Colleague colleague1 = new ConcreteColleague1(mediator);
        Colleague colleague2 = new ConcreteColleague2(mediator);
        
        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        colleague1.send("你吃饭了吗？");
        colleague2.send("还没呢，你要请客？");

        System.out.println("------done------");
    }
    
}
