package club.yuxuan.yun.xuans.designmode.factory.method;

import club.yuxuan.yun.xuans.designmode.factory.simple.BaseOperation;
import club.yuxuan.yun.xuans.designmode.factory.simple.OperationSub;

/**
 * 加法工厂
 *
 * @author yuxuan.han
 * @date 2019/12/16 23:42
 **/
public class SubFactory implements IFactory {
    
    @Override
    public BaseOperation createOperation() {
        return new OperationSub();
    }
    
}
