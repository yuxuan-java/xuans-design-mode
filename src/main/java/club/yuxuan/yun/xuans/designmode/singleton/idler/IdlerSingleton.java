package club.yuxuan.yun.xuans.designmode.singleton.idler;

/**
 * 懒汉式
 *
 * @author yuxuan.han
 * @date 2019/12/24 22:21
 **/
public class IdlerSingleton {

    private static IdlerSingleton instance;

    private IdlerSingleton() {
    }
    
    public static IdlerSingleton getInstance() {
        if (instance == null) {
            instance = new IdlerSingleton();
        }
        return instance;
    }

}
