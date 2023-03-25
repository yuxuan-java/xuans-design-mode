package club.yuxuan.yun.xuans.designmode.builder;

/**
 * 胖子建造者
 *
 * @author yuxuan.han
 * @date 2019/12/17 00:48
 **/
public class PersonFatBuilder extends BasePersonBuilder {
    
    @Override
    public void buildHead() {
        System.out.println("胖胖的头");
    }

    @Override
    public void buildBody() {
        System.out.println("胖胖的身子");
    }

    @Override
    public void buildArmLeft() {
        System.out.println("胖胖的左胳膊");
    }

    @Override
    public void buildArmRight() {
        System.out.println("胖胖的右胳膊");
    }

    @Override
    public void buildLegLeft() {
        System.out.println("胖胖的左腿");
    }

    @Override
    public void buildLegRight() {
        System.out.println("胖胖的右腿");
    }
    
}
