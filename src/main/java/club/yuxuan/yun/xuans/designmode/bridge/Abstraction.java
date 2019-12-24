package club.yuxuan.yun.xuans.designmode.bridge;

public class Abstraction {
    
    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operation();
    }
    
}
