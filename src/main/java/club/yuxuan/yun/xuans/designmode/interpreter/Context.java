package club.yuxuan.yun.xuans.designmode.interpreter;

import lombok.Data;

/**
 * 包含解释器外的一些全局信息
 *
 * @author yuxuan.han
 * @date 2020/1/1 23:09
 **/
@Data
public class Context {
    
    private String input;
    private String output;

    public Context(String input, String output) {
        this.input = input;
        this.output = output;
    }
}
