package club.yuxuan.yun.xuans.designmode.delegate;

import java.lang.reflect.InvocationTargetException;

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
