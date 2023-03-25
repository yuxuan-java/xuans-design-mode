package club.yuxuan.yun.xuans.designmode.decorator;

public abstract class BaseDecorator extends BaseComponent {
    
    protected BaseComponent component;
    
    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }

    public void setComponent(BaseComponent component) {
        this.component = component;
    }
}
