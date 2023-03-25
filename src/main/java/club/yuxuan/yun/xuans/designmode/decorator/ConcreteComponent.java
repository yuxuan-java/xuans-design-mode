package club.yuxuan.yun.xuans.designmode.decorator;

/**
 * 主要操作
 *
 * @author yuxuan.han
 * @date 2019/12/8 20:24
 **/
public class ConcreteComponent extends BaseComponent {
    @Override
    public void operation() {
        System.out.println("主要的操作: 出门");
    }
}
