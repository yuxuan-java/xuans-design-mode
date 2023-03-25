package club.yuxuan.yun.xuans.designmode.visitor.double_dispatch;

/**
 * 男人
 *
 * @author yuxuan.han
 * @date 2020/1/1 23:48
 **/
public class Man extends BasePerson {
    
    @Override
    public void accept(BaseAction visitor) {
        visitor.getConclusion(this);
    }
    
}
