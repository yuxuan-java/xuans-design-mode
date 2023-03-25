package club.yuxuan.yun.xuans.designmode.command;

public abstract class BaseCommand {
    
    protected Receiver receiver;
    
    public BaseCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    
    public abstract void execute();
    
}
