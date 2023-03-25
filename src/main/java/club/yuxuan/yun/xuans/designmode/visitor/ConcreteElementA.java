package club.yuxuan.yun.xuans.designmode.visitor;

public class ConcreteElementA extends BaseElement {
    
    @Override
    public void accept(BaseVisitor visitor) {
        visitor.visitConcreteElementA(this);
    }
    
    public void operationA() {
        //  ConcreteElementA的其它相关方法
    }
    
}
