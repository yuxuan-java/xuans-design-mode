package club.yuxuan.yun.xuans.designmode.mediator;

/**
 * 具体同事1
 *
 * @author yuxuan.han
 * @date 2019/12/27 22:10
 **/
public class ConcreteColleague1 extends Colleague {
    
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }
    
    @Override
    public void send(String message) {
        mediator.send(message, this);
    }
    
    @Override
    public void notify(String message) {
        System.out.println("ConcreteColleague1 get message: " + message);
    }
    
}
