package club.yuxuan.yun.xuans.designmode.state;

public class ConcreteStateA extends State {
    @Override
    public void Handle(StateContext context) {
        System.out.println("ConcreteStateA_execute.");
        context.setState(new ConcreteStateB());
    }
}
