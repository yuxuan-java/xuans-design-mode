package club.yuxuan.yun.xuans.designmode.delegate;

import java.lang.reflect.InvocationTargetException;

/**
 * 委托模式 观察者模式
 *      委托是对函数的封装，可以当做给方法的特征定一个名称。
 *      而时间则是委托的一直特殊形式，当发生有意义的事情时，时间对象处理通知过程。
 *      
 *      观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。
 *      这个主题对象在状态发生变化时，会通知所有观察者对象，使它们能够自动更新自己。
 *      
 * @author yuxuan.han
 * @date 2019/12/15 19:28
 **/
class DelegateMain {

    public static void main(String[] args) throws InterruptedException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        System.out.println("------start------");
        Notifier notifier = new GoodNotifier();
        
        PlayingGameListener playingGameListener = new PlayingGameListener();
        WatchingTVListener watchingTVListener = new WatchingTVListener();
        Long stopTime = System.currentTimeMillis();
        notifier.addListener(playingGameListener, "stopPlay", stopTime);
        notifier.addListener(watchingTVListener, "stopWatch", stopTime);
        
        Thread.sleep(1000);
        
        notifier.notifyX();
        System.out.println("------done------");
    }
    
}
