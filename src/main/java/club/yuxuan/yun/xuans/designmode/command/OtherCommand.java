package club.yuxuan.yun.xuans.designmode.command;

/**
 * 其他命令
 */
public class OtherCommand extends BaseCommand {
    
    public OtherCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        System.out.println("OtherCommand_execute.");
        receiver.action();
    }
    
}
