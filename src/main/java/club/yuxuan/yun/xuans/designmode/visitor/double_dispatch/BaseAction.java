package club.yuxuan.yun.xuans.designmode.visitor.double_dispatch;

/**
 * 动作抽象类
 *
 * @author yuxuan.han
 * @date 2020/1/1 23:46
 **/
public abstract class BaseAction {
    
    public abstract void getConclusion(Man man);
    
    public abstract void getConclusion(Woman woman);
    
}
