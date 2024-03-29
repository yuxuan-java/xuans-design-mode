package club.yuxuan.yun.xuans.designmode.mediator;

/**
 * 抽象同事类
 *
 * @author yuxuan.han
 * @date 2019/12/27 22:07
 **/
public abstract class BaseColleague {
    
    protected BaseMediator mediator;

    public BaseColleague(BaseMediator mediator) {
        this.mediator = mediator;
    }
    
    public abstract void send(String message);
    
    public abstract void notify(String message);
    
}
