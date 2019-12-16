package club.yuxuan.yun.xuans.designmode.template;

/**
 * 抽象模板
 *
 * @author yuxuan.han
 * @date 2019/12/17 00:00
 **/
public abstract class AbstractTemplateClass {

    public abstract void primitiveOperation1();

    public abstract void primitiveOperation2();
    
    public void templateMethod() {
        primitiveOperation1();
        System.out.println("---抽象模板中通用的操作---");
        primitiveOperation2();
    }

}
