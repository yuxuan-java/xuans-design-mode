package club.yuxuan.yun.xuans.designmode.state;

public class ConcreteStateB extends State {
    @Override
    public void Handle(StateContext context) {
        System.out.println("ConcreteStateB_execute.");
        context.setState(new ConcreteStateC());
    }
}
