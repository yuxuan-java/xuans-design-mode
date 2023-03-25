package club.yuxuan.yun.xuans.designmode.factory.method;

import club.yuxuan.yun.xuans.designmode.factory.simple.BaseOperation;

/**
 * 工厂接口
 *
 * @author yuxuan.han
 * @date 2019/12/16 23:41
 **/
public interface IFactory {
    
    BaseOperation createOperation();
    
}
