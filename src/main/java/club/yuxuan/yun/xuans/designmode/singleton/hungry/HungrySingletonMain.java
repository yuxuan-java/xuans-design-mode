package club.yuxuan.yun.xuans.designmode.singleton.hungry;

/**
 * 单例模式(饿汉)
 *      这种静态初始化的方式是在自己类被加载时就将自己实例化，所以被形象地称为饿汉式。 
 *
 * @author yuxuan.han
 * @date 2019/12/24 22:30
 **/
public class HungrySingletonMain {

    public static void main(String[] args) {
        HungrySingleton s1 = HungrySingleton.getInstance();
        HungrySingleton s2 = HungrySingleton.getInstance();

        if (s1 == s2) {
            System.out.println("两个对象的实例相同.");
        }

        System.out.println("------done------");
    }
    
}
