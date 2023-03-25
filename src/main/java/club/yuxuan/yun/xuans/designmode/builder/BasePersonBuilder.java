package club.yuxuan.yun.xuans.designmode.builder;

/**
 * 人类建造者
 *
 * @author yuxuan.han
 * @date 2019/12/17 00:39
 **/
public abstract class BasePersonBuilder {

    /**
     * 构建头
     */
    public abstract void buildHead();

    /**
     * 构建身体
     */
    public abstract void buildBody();

    /**
     * 构建左胳膊
     */
    public abstract void buildArmLeft();

    /**
     * 构建右胳膊
     */
    public abstract void buildArmRight();

    /**
     * 构建左腿
     */
    public abstract void buildLegLeft();

    /**
     * 构建右腿
     */
    public abstract void buildLegRight();
    
}
