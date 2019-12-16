package club.yuxuan.yun.xuans.designmode.memento2;

import club.yuxuan.yun.xuans.designmode.memento.Memento;
import lombok.Data;

/**
 * 管理者
 *
 * @author yuxuan.han
 * @date 2019/12/15 23:18
 **/
@Data
public class Caretaker2<T> {
    
    private T memento2;
    
}
