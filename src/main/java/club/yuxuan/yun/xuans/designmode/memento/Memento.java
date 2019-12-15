package club.yuxuan.yun.xuans.designmode.memento;

/**
 * 备忘录
 *      把要保存的细节封装到Memento中
 *      如果需要修改保存的细节，不会影响客户端。
 *
 * @author yuxuan.han
 * @date 2019/12/15 23:16
 **/
public class Memento {
    
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
