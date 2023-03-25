package club.yuxuan.yun.xuans.designmode.mediator;

import lombok.Setter;

/**
 * 具体中介者
 *
 * @author yuxuan.han
 * @date 2019/12/27 22:08
 **/
@Setter
public class ConcreteMediator extends BaseMediator {
    
    private BaseColleague colleague1;
    private BaseColleague colleague2;
    
    @Override
    public void send(String message, BaseColleague colleague) {
        if (colleague == colleague1) {
            colleague2.notify(message);
        } else {
            colleague1.notify(message);
        }
    }
    
}
