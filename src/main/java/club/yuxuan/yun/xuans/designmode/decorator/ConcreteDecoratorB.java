package club.yuxuan.yun.xuans.designmode.decorator;

/**
 * 装饰对象B
 *
 * @author yuxuan.han
 * @date 2019/12/8 20:30
 **/
public class ConcreteDecoratorB extends BaseDecorator {

    @Override
    public void operation() {
        System.out.print("装饰对象B的操作: ");
        bDoSomeThing();
        super.operation();
    }

    private void bDoSomeThing() {
        System.out.println("穿鞋");
    }
    
}
