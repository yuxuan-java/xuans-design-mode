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
 *      适用于当一个对象的改变需要同时改变其它对象的时候。
 *      将一个系统分割成一系列相互协作的类又以一个很不好的副作用，那就是需要维护相关对象间的一致性。
 *      我们不希望为了维持一致性而使各类紧密耦合，这样会给维护、扩展和重用都带来不便。
 *      当它不知道具体有多少对象有待改变的时候，应该考虑使用观察者模式。
 *      
 *      一个抽象模型有两个方面，其中一方面依赖于另一方面，这时用观察者模式可以将这两者封装在独立的对象中
 *      使它们各自独立地改变和复用。
 *      
 *      观察者模式所做的工作其实就是在解除耦合。
 *      让耦合的双方都依赖于抽象，而不是依赖于具体。
 *      从而使各自的变化都不会影响另一边的变化。
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
