package club.yuxuan.yun.xuans.designmode.chainofresponsibility;

/**
 * 责任链模式
 *      使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。
 *      将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
 *      
 *      当客户提交一个请求时，请求时沿着链传递直至有一个ConcreteHandler对象负责处理。
 *      
 *      接收者和发送者都没有对象的明确信息，且链中对象自己也并不知道链的结构。
 *      结果是责任链可以简化对象的互相连接，它们仅需保持一个指向其后继者的引用，而不需保持它所有的候选接受者的引用。
 *      
 *      随时地增加或者修改处理一个请求的结构，增加了给对象指派责任的灵活性。
 *      
 *      注意：一个请求极有可能到了链的末端都得不到处理，或者因为没有正确配置而得不到处理。
 *
 * @author yuxuan.han
 * @date 2019/12/25 23:18
 **/
public class ChainOfResponsibilityMain {

    public static void main(String[] args) {
        BaseHandler h1 = new ConcreteHandlerA();
        BaseHandler h2 = new ConcreteHandlerB();
        BaseHandler h3 = new ConcreteHandlerC();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);
        
        int[] requests = {2, 5, 14, 22, 18, 3, 27, 20, 30, 50};
        
        for (int request : requests) {
            h1.handlerRequest(request);
        }

        //  request 50 没有被处理
        
        System.out.println("------done------");
    }
    
}
