package club.yuxuan.yun.xuans.designmode.state;

public class ConcreteStateB extends BaseState {
    @Override
    public void handle(StateContext context) {
        System.out.println("ConcreteStateB_execute.");
        context.setState(new ConcreteStateC());
    }
}
