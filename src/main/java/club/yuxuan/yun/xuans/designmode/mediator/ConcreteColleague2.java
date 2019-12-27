package club.yuxuan.yun.xuans.designmode.mediator;

/**
 * 具体同事2
 *
 * @author yuxuan.han
 * @date 2019/12/27 22:10
 **/
public class ConcreteColleague2 extends Colleague {
    
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }
    
    @Override
    public void send(String message) {
        mediator.send(message, this);
    }
    
    @Override
    public void notify(String message) {
        System.out.println("ConcreteColleague2 get message: " + message);
    }
    
}
