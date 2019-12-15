package club.yuxuan.yun.xuans.designmode.state;

import lombok.Data;

@Data
public class Context {
    
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("改变状态->  " + state);
    }
    
    public void request() {
        state.Handle(this);
    }
    
}
