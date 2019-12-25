package club.yuxuan.yun.xuans.designmode.chainofresponsibility;

public abstract class Handler {
    
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    
    public abstract void handlerRequest(int request);
    
}
