package club.yuxuan.yun.xuans.designmode.adapter;

/**
 * 适配器模式
 *      将一个类的接口转换成客户希望的另外一个接口。
 *      Adapter模式使得原来由于接口不兼容而不能一起工作的那些类可以一起工作。
 *      
 *      系统的数据和行为都正确，但接口不符时，我们应该考虑用适配器，目的是使控制范围之外的一个原有对象与某个接口匹配。
 *      适配器模式主要应用于希望复用一些现存的类，但是接口又与复用环境要求不一致的情况。
 *      
 *      在想使用一个已经存在的类，但是如果它的接口，也就是它的方法和你的要求不相同时，就应该考虑用适配器模式。
 *      两个类所做的事情相同或相似，但是具有不同的接口时要使用它。
 *      要在双方都不太容易修改的时候再使用适配器模式(有点亡羊补牢的意思...)
 *
 * @author yuxuan.han
 * @date 2019/12/15 19:23
 **/
public class AdapterMain {

    public static void main(String[] args) {
        BaseTarget target = new Adapter();
        target.request();

        System.out.println("------done------");
    }
    
}
