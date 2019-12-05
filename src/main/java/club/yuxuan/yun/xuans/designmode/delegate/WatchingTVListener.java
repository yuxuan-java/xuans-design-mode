package club.yuxuan.yun.xuans.designmode.delegate;

import lombok.ToString;

class WatchingTVListener {

    public WatchingTVListener() {
        System.out.println("WatchingTVListener: " + System.currentTimeMillis());
    }

    public void stopWatch(Long stopTime) {
        System.out.println("WatchingTVListener-stopWatch: " + stopTime);
    }
    
}
