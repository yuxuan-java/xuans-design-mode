package club.yuxuan.yun.xuans.designmode.visitor;

public class ConcreteElementB extends BaseElement {
    
    @Override
    public void accept(BaseVisitor visitor) {
        visitor.visitConcreteElementB(this);
    }
    
    public void operationB() {
        //  ConcreteElementB的其它相关方法
    }
    
}
