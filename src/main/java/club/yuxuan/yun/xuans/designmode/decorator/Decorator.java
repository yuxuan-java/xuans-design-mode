package club.yuxuan.yun.xuans.designmode.decorator;

/**
 * 装饰操作
 *
 * @author yuxuan.han
 * @date 2019/12/8 20:25
 **/
public abstract class Decorator extends Component {
    
    protected Component component;
    
    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }

    public void setComponent(Component component) {
        this.component = component;
    }
}
