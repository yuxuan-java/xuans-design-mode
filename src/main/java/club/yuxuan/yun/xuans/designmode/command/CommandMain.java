package club.yuxuan.yun.xuans.designmode.command;

/**
 * 命令模式
 *      将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化；
 *      对请求排队或记录错误日志，以及支持可撤销的操作。
 *      
 *      第一，它能较容易地设计一个命令队列；
 *      第二，在需要的情况下，可以较容易地将命令记入日志；
 *      第三，允许接收请求的一方绝情是否要否决请求；
 *      第四，可以容易地实现对请求的撤销和重做；
 *      第五，由于加进新的具体命令类不影响其它的类，因此增加新的具体命令类很容易。
 *      
 *      命令模式把请求一个操作的对象与指导怎么执行一个操作的对象分割开。
 *      
 *      敏捷开发原则告诉我们，不要为代码添加基于猜测的、实际不需要的功能。
 *      如果不清楚一个系统是否需要命令模式，一般就不要着急去实现它，
 *      事实上，在需要的时候通过重构实现这个模式并不困难，
 *      只有在真正需要如撤销/恢复操作等功能时，把原来的代码重构为命令模式才有意义。
 *
 * @author yuxuan.han
 * @date 2019/12/25 00:01
 **/
public class CommandMain {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command1 = new ConcreteCommand(receiver);
        Command command2 = new OtherCommand(receiver);
        
        Invoker invoker = new Invoker();
        invoker.setCommand(command1);
        invoker.setCommand(command2);
        invoker.executeCommand();

        System.out.println("------done------");
    }
    
}
