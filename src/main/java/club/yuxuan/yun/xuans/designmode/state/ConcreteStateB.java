package club.yuxuan.yun.xuans.designmode.state;

public class ConcreteStateB extends State {
    @Override
    public void Handle(Context context) {
        System.out.println("ConcreteStateB_execute.");
        context.setState(new ConcreteStateC());
    }
}
