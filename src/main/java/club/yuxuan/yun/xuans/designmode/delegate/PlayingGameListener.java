package club.yuxuan.yun.xuans.designmode.delegate;

import lombok.ToString;

class PlayingGameListener {

    public PlayingGameListener() {
        System.out.println("PlayingGameListener: " + System.currentTimeMillis());
    }

    public void stopPlay(Long stopTime) {
        System.out.println("PlayingGameListener-stopPlay: " + stopTime);
    }
    
}
