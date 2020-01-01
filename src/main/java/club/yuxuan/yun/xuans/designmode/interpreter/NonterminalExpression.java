package club.yuxuan.yun.xuans.designmode.interpreter;

/**
 * 非终结符表达式
 *
 * @author yuxuan.han
 * @date 2020/1/1 23:11
 **/
public class NonterminalExpression extends AbstractExpression {

    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器: " + context.getOutput() + "---" + context.getInput());
    }
    
}
