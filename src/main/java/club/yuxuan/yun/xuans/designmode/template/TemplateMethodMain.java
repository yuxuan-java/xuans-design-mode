package club.yuxuan.yun.xuans.designmode.template;

/**
 * 模板方法模式
 *      定义一个操作中的算法骨架，而将一些步骤延迟到子类当中。
 *      模板方法模式使得子类可以不改变一个算法的结构即可重新定义该算法的某些特定步骤。
 *      
 *      模板方法模式时通过把不变的行为搬移到超类，去除子类中的重复代码来提现它的优势。
 *      模板方法模式就是提供了一个很好代码复用平台。
 *      
 *      当不变的和可变的行为在方法的子类实现中混合在一起的时候，
 *          不变的行为就会在子类中重复出现。
 *      通过模板方法模式把这些行为搬移到单一的地方，这样就帮助子类摆脱重复的不便行为的纠缠。
 *
 * @author yuxuan.han
 * @date 2019/12/16 23:58
 **/
public class TemplateMethodMain {

    public static void main(String[] args) {
        AbstractTemplateClass templateClass;
        
        templateClass = new ConcreteClassA();
        templateClass.templateMethod();

        System.out.println();
        
        templateClass = new ConcreteClassB();
        templateClass.templateMethod();

        System.out.println("------done------");
    }
    
}
