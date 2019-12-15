package club.yuxuan.yun.xuans.designmode.memento;

import lombok.Data;

/**
 * 发起人
 *
 * @author yuxuan.han
 * @date 2019/12/15 23:15
 **/
@Data
public class Originator {
    
    private String state;
    
    public Memento createMemento() {
        return new Memento(state);
    }

    public void setMemento(Memento memento) {
        this.state = memento.getState();
    }

    public void show() {
        System.out.println("Originator_state: " + state);
    }
    
}
