package club.yuxuan.yun.xuans.designmode.proxy;

/**
 * Proxy所代表的真实实体
 *
 * @author yuxuan.han
 * @date 2019/12/16 23:24
 **/
public class RealSubject extends BaseSubject {
    
    @Override
    public void request() {
        System.out.println("真实的请求");
    }
    
}
