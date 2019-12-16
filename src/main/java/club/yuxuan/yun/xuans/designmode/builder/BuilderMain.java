package club.yuxuan.yun.xuans.designmode.builder;

/**
 * 建造者模式
 *      将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 *      使用了建造者模式，用户就只需指定需要建造的类型就可以得到它们，而具体建造的过程和细节就不需要知道了。
 *      
 *      主要是用于创建一些复杂的对象，这些对象内部构建间的建造顺序通常是稳定的，但对象内部的构建通常面临着复杂的变化。
 *      
 *      建造者模式的好处就是使得建造代码与表示代码分离，由于建造者隐藏了该产品是如何组装的，
 *          所以若需要改变一个产品的内部表示，只需要再定义一个具体的建造者就可以了。
 *      
 *      建造者模式是在当创建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方式时适用的模式。
 *
 * @author yuxuan.han
 * @date 2019/12/17 00:37
 **/
public class BuilderMain {

    public static void main(String[] args) {
        PersonDirector personDirector;
        
        personDirector = new PersonDirector(new PersonThinBuilder());
        personDirector.createPerson();

        System.out.println();
        
        personDirector = new PersonDirector(new PersonFatBuilder());
        personDirector.createPerson();

        System.out.println("------done------");
    }
    
}
