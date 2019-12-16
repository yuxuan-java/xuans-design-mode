package club.yuxuan.yun.xuans.designmode.state;

public class ConcreteStateC extends State {
    @Override
    public void Handle(StateContext context) {
        System.out.println("ConcreteStateC_execute.");
        context.setState(new ConcreteStateA());
    }
}
