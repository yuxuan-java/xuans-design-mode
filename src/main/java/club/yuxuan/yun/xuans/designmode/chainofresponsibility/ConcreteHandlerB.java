package club.yuxuan.yun.xuans.designmode.chainofresponsibility;

public class ConcreteHandlerB extends BaseHandler {
    
    @Override
    public void handlerRequest(int request) {
        if (request > 10 && request <= 20) {
            System.out.println(this.getClass().getName() + " 处理请求: " + request);
        } else if (successor != null) {
            successor.handlerRequest(request);
        }
    }
    
}
