package club.yuxuan.yun.xuans.designmode.chainofresponsibility;

public class ConcreteHandlerA extends Handler {
    
    @Override
    public void handlerRequest(int request) {
        if (request >= 0 && request <= 10) {
            System.out.println(this.getClass().getName() + " 处理请求: " + request);
        } else if (successor != null) {
            successor.handlerRequest(request);
        }
    }
    
}
