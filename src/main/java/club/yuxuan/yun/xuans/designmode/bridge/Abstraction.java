package club.yuxuan.yun.xuans.designmode.bridge;

public class Abstraction {
    
    protected BaseImplementor implementor;

    public void setImplementor(BaseImplementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operation();
    }
    
}
