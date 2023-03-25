package club.yuxuan.yun.xuans.designmode.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<BaseCommand> commands = new ArrayList<>();

    public void setCommand(BaseCommand command) {
        commands.add(command);
    }

    public void executeCommand() {
        for (BaseCommand command : commands) {
            command.execute();
        }
    }

}
