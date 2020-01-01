package club.yuxuan.yun.xuans.designmode.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * 解释器模式
 *      给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。
 *      
 *      如果一种特定类型的问题发生的频率足够高，那么可能就值得将该问题的各个实例表述为一个简单语言中的句子。
 *      这样就可以构建一个解释器，该解释器通过解释这些句子来解决该问题。（例如：正则表达式）
 *      
 *      当又一个语言需要解释执行，并且你可将该语言中的句子表示为一个抽象语法树时，可使用解释器模式。
 *      
 *      解释器模式可以很容易地改变和扩展文法，因为该模式使用类来表示文法规则，
 *      你可以使用继承来改变或扩展该文法。
 *      也比较容易实现文法，因为定义抽象语法树中各个节点的类的实现大体类似，这些类都易于直接编写。
 *      
 *      解释器模式也有不足，解释器模式为文法中的每一条规则至少定义了一个类，
 *      因此包含许多规则的文法可能难以管理和维护。
 *      建议当文法非常复杂时，使用其他的技术如语法分析程序或编译器生成器来处理。
 *
 * @author yuxuan.han
 * @date 2020/1/1 20:54
 **/
public class InterpreterMain {

    public static void main(String[] args) {
        Context context = new Context("in", "out");
        List<AbstractExpression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());
        
        for (AbstractExpression expression : list) {
            expression.interpret(context);
        }

        System.out.println("------done------");
    }
    
}
