package club.yuxuan.yun.xuans.designmode.factory.method;

import club.yuxuan.yun.xuans.designmode.factory.simple.Operation;
import club.yuxuan.yun.xuans.designmode.factory.simple.OperationAdd;
import club.yuxuan.yun.xuans.designmode.factory.simple.OperationDiv;

/**
 * 加法工厂
 *
 * @author yuxuan.han
 * @date 2019/12/16 23:42
 **/
public class DivFactory implements IFactory {
    
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
    
}
