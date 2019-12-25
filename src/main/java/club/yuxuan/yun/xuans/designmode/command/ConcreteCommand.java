package club.yuxuan.yun.xuans.designmode.command;

public class ConcreteCommand extends Command {

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        System.out.println("ConcreteCommand_execute.");
        receiver.action();
    }
    
}
