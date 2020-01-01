package club.yuxuan.yun.xuans.designmode.visitor.double_dispatch;

/**
 * 男人
 *
 * @author yuxuan.han
 * @date 2020/1/1 23:48
 **/
public class Man extends Person {
    
    @Override
    public void accept(Action visitor) {
        visitor.getConclusion(this);
    }
    
}
