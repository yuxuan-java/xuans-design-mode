package club.yuxuan.yun.xuans.designmode.factory.method;

import club.yuxuan.yun.xuans.designmode.factory.simple.BaseOperation;
import club.yuxuan.yun.xuans.designmode.factory.simple.OperationDiv;

/**
 * 加法工厂
 *
 * @author yuxuan.han
 * @date 2019/12/16 23:42
 **/
public class DivFactory implements IFactory {
    
    @Override
    public BaseOperation createOperation() {
        return new OperationDiv();
    }
    
}
