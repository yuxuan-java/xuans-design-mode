package club.yuxuan.yun.xuans.designmode.singleton.doublechecklock;

import club.yuxuan.yun.xuans.designmode.singleton.idler.IdlerSingleton;

/**
 * 单例模式(双重校验锁)
 *      synchronized关键字是确保党一个线程位于代码的临界区时，另一个线程不进入临界区。
 *      如果其它线程试图进入锁定的代码，则它将一直等待(被阻塞)，直到该对象被释放。
 *
 * @author yuxuan.han
 * @date 2019/12/24 22:33
 **/
public class DoubleCheckLockingSingletonMain {

    public static void main(String[] args) {
        DoubleCheckLockingSingleton s1 = DoubleCheckLockingSingleton.getInstance();
        DoubleCheckLockingSingleton s2 = DoubleCheckLockingSingleton.getInstance();

        if (s1 == s2) {
            System.out.println("两个对象的实例相同.");
        }

        System.out.println("------done------");
    }
    
}
