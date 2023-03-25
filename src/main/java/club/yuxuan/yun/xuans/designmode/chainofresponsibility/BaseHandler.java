package club.yuxuan.yun.xuans.designmode.chainofresponsibility;

public abstract class BaseHandler {
    
    protected BaseHandler successor;

    public void setSuccessor(BaseHandler successor) {
        this.successor = successor;
    }
    
    public abstract void handlerRequest(int request);
    
}
