package club.yuxuan.yun.xuans.designmode.visitor;

/**
 * 访问者模式
 *      表示一个作用于某对象结构汇中的各元素的操作。
 *      它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作。
 *      
 *      访问者模式适用于数据结构相对稳定的系统
 *      它把数据结构和作用于结构上的操作之间的耦合解脱开，使得操作集合可以相对自由地演化。
 *      
 *      访问者模式的目的是要把处理从数据结构分离出来。
 *      有比较稳定的数据结构，又有易于算法的变化，使用访问者模式是比较合适的，
 *      因为访问者模式使得算法操作的增加变得更容易。
 *      
 *      访问者模式的优点就是增加新的操作很容易，
 *      因为增加新的操作就只意味着增加一个新的访问者。
 *      访问者模式将有关的行为集中到一个访问者对象中。
 *      
 *      访问者的缺点其实也就是增加新的数据结构变得困难了。
 *
 * @author yuxuan.han
 * @date 2020/1/1 23:41
 **/
public class VisitorMain {

    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.attach(new ConcreteElementA());
        structure.attach(new ConcreteElementB());
        
        ConcreteVisitor1 visitor1 = new ConcreteVisitor1();
        ConcreteVisitor2 visitor2 = new ConcreteVisitor2();
        
        structure.accept(visitor1);
        structure.accept(visitor2);

        System.out.println("------done------");
    }
    
}
