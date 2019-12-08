package club.yuxuan.yun.xuans.designmode.decorator;

/**
 * 装饰对象A
 *
 * @author yuxuan.han
 * @date 2019/12/8 20:30
 **/
public class ConcreteDecoratorA extends Decorator {
    
    private String addedState;

    @Override
    public void operation() {
        addedState = "穿袜子";
        System.out.println("装饰对象A的操作: " + addedState);
        super.operation();
    }
    
}
