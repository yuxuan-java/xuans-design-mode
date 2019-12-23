package club.yuxuan.yun.xuans.designmode.memento.memento2;

import lombok.Data;

/**
 * 发起人
 *
 * @author yuxuan.han
 * @date 2019/12/15 23:15
 **/
@Data
public class Originator2 {
    
    private String state;
    
    public Memento2 createMemento() {
        return new Memento2(state);
    }

    public void setMemento(Memento2 memento2) {
        this.state = memento2.getState();
    }

    public void show() {
        System.out.println("Originator_state: " + state);
    }
    
}
