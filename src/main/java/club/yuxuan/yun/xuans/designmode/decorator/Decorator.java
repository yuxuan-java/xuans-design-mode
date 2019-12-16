package club.yuxuan.yun.xuans.designmode.decorator;

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
