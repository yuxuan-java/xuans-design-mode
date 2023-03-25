package club.yuxuan.yun.xuans.designmode.visitor.double_dispatch;

/**
 * 女人
 *
 * @author yuxuan.han
 * @date 2020/1/1 23:49
 **/
public class Woman extends BasePerson {
    
    @Override
    public void accept(BaseAction visitor) {
        visitor.getConclusion(this);
    }
    
}
