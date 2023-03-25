package club.yuxuan.yun.xuans.designmode.singleton.hungry;

/**
 * 饿汉式
 *
 * @author yuxuan.han
 * @date 2019/12/24 22:31
 **/
public class HungrySingleton {
    
    private static final HungrySingleton INSTANCE = new HungrySingleton();
    
    private HungrySingleton(){
    }
    
    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
    
}
