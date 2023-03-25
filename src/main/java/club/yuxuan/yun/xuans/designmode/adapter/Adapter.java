package club.yuxuan.yun.xuans.designmode.adapter;

/**
 * 适配器
 *
 * @author yuxuan.han
 * @date 2020/11/25 上午11:01
 **/
public class Adapter extends BaseTarget {
    
    private Adaptee adaptee = new Adaptee();
    
    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
