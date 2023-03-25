package club.yuxuan.yun.xuans.designmode.state;

public class ConcreteStateC extends BaseState {
    @Override
    public void handle(StateContext context) {
        System.out.println("ConcreteStateC_execute.");
        context.setState(new ConcreteStateA());
    }
}
