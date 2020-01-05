package club.yuxuan.yun.xuans.designmode.visitor;

public class ConcreteElementB extends Element {
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }
    
    public void operationB() {
        //  ConcreteElementB的其它相关方法
    }
    
}
