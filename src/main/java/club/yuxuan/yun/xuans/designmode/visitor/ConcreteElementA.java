package club.yuxuan.yun.xuans.designmode.visitor;

public class ConcreteElementA extends Element {
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }
    
    public void operationA() {
        //  ConcreteElementA的其它相关方法
    }
    
}
