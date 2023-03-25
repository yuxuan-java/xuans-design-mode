package club.yuxuan.yun.xuans.designmode.proxy;

/**
 * 代理对象，保存一个引用使得代理可以访问实体
 *      并提供一个与Subject的接口相同的接口，用代理对象来替代真实实体
 *
 * @author yuxuan.han
 * @date 2019/12/16 23:25
 **/
public class Proxy extends BaseSubject {
    
    RealSubject realSubject;
    
    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        System.out.println("代理对象中的代码");
        realSubject.request();
    }
    
}
