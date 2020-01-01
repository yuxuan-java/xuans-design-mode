package club.yuxuan.yun.xuans.designmode.interpreter;

/**
 * 终结符表达式
 *
 * @author yuxuan.han
 * @date 2020/1/1 23:11
 **/
public class TerminalExpression extends AbstractExpression {
    
    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器: " + context.getInput() + "---" + context.getOutput());
    }
    
}
