package club.yuxuan.yun.xuans.designmode.template;

/**
 * 具体实现类A
 *
 * @author yuxuan.han
 * @date 2019/12/17 00:02
 **/
public class ConcreteClassA extends AbstractTemplateClass {
    
    @Override
    public void primitiveOperation1() {
        System.out.println("具体类A的方法1实现A1");    
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("具体类A的方法2实现A2");
    }
    
}
