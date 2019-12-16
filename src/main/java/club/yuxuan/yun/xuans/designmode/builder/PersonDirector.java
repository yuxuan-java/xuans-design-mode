package club.yuxuan.yun.xuans.designmode.builder;

/**
 * 指挥者
 *      指挥者负责控制建造过程，用它来隔离用户与建造过程的关联
 *
 * @author yuxuan.han
 * @date 2019/12/17 00:51
 **/
public class PersonDirector {
    
    private PersonBuilder personBuilder;

    public PersonDirector(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }
    
    public void createPerson() {
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildArmLeft();
        personBuilder.buildArmRight();
        personBuilder.buildLegLeft();
        personBuilder.buildLegRight();
    }
    
}
