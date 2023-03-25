package club.yuxuan.yun.xuans.designmode.builder;

/**
 * 瘦子建造者
 *
 * @author yuxuan.han
 * @date 2019/12/17 00:48
 **/
public class PersonThinBuilder extends BasePersonBuilder {
    
    @Override
    public void buildHead() {
        System.out.println("瘦瘦的头");
    }

    @Override
    public void buildBody() {
        System.out.println("瘦瘦的身子");
    }

    @Override
    public void buildArmLeft() {
        System.out.println("瘦瘦的左胳膊");
    }

    @Override
    public void buildArmRight() {
        System.out.println("瘦瘦的右胳膊");
    }

    @Override
    public void buildLegLeft() {
        System.out.println("瘦瘦的左腿");
    }

    @Override
    public void buildLegRight() {
        System.out.println("瘦瘦的右腿");
    }
    
}
