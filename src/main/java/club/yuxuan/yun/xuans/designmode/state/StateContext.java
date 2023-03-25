package club.yuxuan.yun.xuans.designmode.state;

import lombok.Data;

@Data
public class StateContext {
    
    private BaseState state;

    public StateContext(BaseState state) {
        this.state = state;
    }

    public void setState(BaseState state) {
        this.state = state;
        System.out.println("改变状态->  " + state);
    }
    
    public void request() {
        state.handle(this);
    }
    
}
