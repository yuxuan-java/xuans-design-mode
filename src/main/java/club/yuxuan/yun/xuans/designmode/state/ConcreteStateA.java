package club.yuxuan.yun.xuans.designmode.state;

public class ConcreteStateA extends BaseState {
    @Override
    public void handle(StateContext context) {
        System.out.println("ConcreteStateA_execute.");
        context.setState(new ConcreteStateB());
    }
}
