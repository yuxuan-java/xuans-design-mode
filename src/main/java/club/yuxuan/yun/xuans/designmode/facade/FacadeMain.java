package club.yuxuan.yun.xuans.designmode.facade;

/**
 * 外观模式
 *      为子系统中的一组接口提供一个一致的界面，此模板定义了一个高层级接口，这个接口使得这一子系统更加容易使用。
 *      
 *      首先，在设计初期阶段，应该要有意识的将不同的两个层分离(比如经典三层架构)，层与层之间建立外观Facade。
 *      其次，在开发阶段，子系统往往因为不断的重构演化而变得越来越复杂，
 *          增加外观Facade可以提供一个简单的接口，减少了它们之间的依赖。
 *      第三，在维护一个遗留的大型系统时，可能这个系统已经非常难以维护和扩展，为新系统开发一个外观Facade类，
 *          来提供设计粗糙或高度复杂的遗留代码的比较清晰简单的接口，
 *          让新系统与Facade对象交互，Facade与遗留代码交互所有复杂的工作。
 *
 * @author yuxuan.han
 * @date 2019/12/17 00:09
 **/
public class FacadeMain {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        
        System.out.println();
        
        facade.methodB();

        System.out.println("------done------");
    }
    
}
