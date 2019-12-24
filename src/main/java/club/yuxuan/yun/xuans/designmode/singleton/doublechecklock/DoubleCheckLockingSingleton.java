package club.yuxuan.yun.xuans.designmode.singleton.doublechecklock;

/**
 * 单例-双重锁定
 *
 * @author yuxuan.han
 * @date 2019/12/24 22:34
 **/
public class DoubleCheckLockingSingleton {
    
    private volatile static DoubleCheckLockingSingleton instance;
    
    private DoubleCheckLockingSingleton(){
    }
    
    public static DoubleCheckLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }
    
}
