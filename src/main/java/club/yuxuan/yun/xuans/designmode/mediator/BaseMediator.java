package club.yuxuan.yun.xuans.designmode.mediator;

/**
 * 抽象中介者
 *
 * @author yuxuan.han
 * @date 2019/12/27 22:07
 **/
public abstract class BaseMediator {
    
    public abstract void send(String message, BaseColleague colleague);
    
}
