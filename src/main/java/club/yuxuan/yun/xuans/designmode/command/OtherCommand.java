package club.yuxuan.yun.xuans.designmode.command;

public class OtherCommand extends Command {
    
    public OtherCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        System.out.println("OtherCommand_execute.");
        receiver.action();
    }
    
}
