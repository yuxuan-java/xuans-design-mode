package club.yuxuan.yun.xuans.designmode.strategy;

/**
 * 具体算法A
 *      封装了具体的算法和行为，继续于Strategy
 *
 * @author yuxuan.han
 * @date 2019/12/16 22:43
 **/
public class ConcreteStrategyA extends BaseStrategy {
    
    @Override
    public void algorithmInterface() {
        System.out.println("具体算法A的实现逻辑");
    }
    
}
