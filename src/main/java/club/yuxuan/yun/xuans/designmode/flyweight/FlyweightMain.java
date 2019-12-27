package club.yuxuan.yun.xuans.designmode.flyweight;

/**
 * 享元模式
 *      运用共享技术有效地支持大量细粒度的对象。
 *      
 * 内部状态与外部状态
 *      享元模式可以避免大量非常相似类的开销。
 *      在程序设计汇中，有时需要生成大量细粒度的类实例来表示数据。
 *      如果能发现这些实例除了几个参数外基本上都是相同的，有时就能够大幅度地减少需要实例化的类的数量。
 *      如果鞥把那些参数移到类实例的外面，在方法调用时将它们传递过来，就可以通过共享大幅度地减少单个实例的数量。
 *      
 * 应用
 *      如果一个应用程序使用了大量的对象，而大量的这些对象造成了很大的存储开小时就应该考虑使用；
 *      还有就是对象的大多数状态可以是外部状态，如果删除对象的外部状态，
 *      那么可以用相对较少的共享对象取代很多组对象，此时可以考虑使用享元模式。
 *      
 *      在某些情况下，对象的数量可能会太多，从而导致运行时的资源与性能损耗。
 *      使用享元模式需要维护一个记录了系统已有的所有享元的列表，而这本身也很耗费资源，
 *      另外享元模式使得系统更加复杂。
 *      为了使对象可以共享，需要将一些状态外部化，这使得程序的逻辑复杂化。
 *      因此，应当在有足够多的重复对象实例可供共享时才值得使用享元模式。
 *
 * @author yuxuan.han
 * @date 2019/12/27 22:32
 **/
public class FlyweightMain {

    public static void main(String[] args) {
        String extrinsicState = "extrinsicState";
        
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight flyweight1 = factory.getFlyweight(extrinsicState + "A");
        flyweight1.operation("AAA");

        Flyweight flyweight2 = factory.getFlyweight(extrinsicState + "B");
        flyweight2.operation("BBB");

        Flyweight flyweight3 = factory.getFlyweight(extrinsicState + "C");
        flyweight3.operation("CCC");

        Flyweight flyweight4 = factory.getFlyweight(extrinsicState + "A");
        flyweight4.operation("DDD");
        
        for (int i = 0; i < 20; i++) {
            Flyweight flyweight = factory.getFlyweight(i + "");
            flyweight.operation(extrinsicState + i);
        }

        System.out.println(factory.getFlyweightCount());

        System.out.println("------done------");
    }
    
}
