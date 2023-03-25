package club.yuxuan.yun.xuans.designmode.strategy;

/**
 * 用Context来维护一个队Strategy对象的引用
 *
 * @author yuxuan.han
 * @date 2019/12/16 22:45
 **/
public class StrategyContext {

    BaseStrategy strategy;

    /**
     * 初始化时传入具体的策略对象
     * @param strategy
     */
    public StrategyContext(BaseStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 根据具体的策略对象，调用其算法的方法
     */
    public void contextInterface() {
        strategy.algorithmInterface();
    }
    
}
