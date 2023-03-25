package club.yuxuan.yun.xuans.designmode.proxy;

/**
 * 代理模式
 *      为其它对象提供一种代理以控制这个对象的访问。
 *      
 * 应用场景：
 *      1.远程代理，就是为一个对象在不同的地址空间提供局部代表。
 *          这样可以隐藏一个对象存在于不同地址空间的事实。
 *      2.虚拟代理，是根据需要创建开销很大的对象。
 *          通过它来存放实例化需要很长时间的真实对象。
 *      3.安全代理，用来控制真实对象访问时的权限。
 *      4.智能指引，指当调用真实的对象时，代理对象处理另外一些事情(计算调用次数，记log等)。
 *
 * @author yuxuan.han
 * @date 2019/12/16 23:22
 **/
public class ProxyMain {

    public static void main(String[] args) {
        BaseSubject proxy = new Proxy();
        proxy.request();

        System.out.println("------done------");
    }
    
}
