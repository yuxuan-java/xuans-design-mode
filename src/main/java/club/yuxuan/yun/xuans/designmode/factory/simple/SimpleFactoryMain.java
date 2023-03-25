package club.yuxuan.yun.xuans.designmode.factory.simple;

import java.math.BigDecimal;

/**
 * 简单工厂模式
 *      让业务逻辑与客户端逻辑分开，让它们之间耦合度下降。
 *      简单工厂模式并不符合开放-封闭原则
 *
 * @author yuxuan.han
 * @date 2019/12/16 22:23
 **/
public class SimpleFactoryMain {

    public static void main(String[] args) {
        BaseOperation operation = OperationFactory.createOperate("+");
        operation.setNumberA(new BigDecimal("1"));
        operation.setNumberB(new BigDecimal("2"));
        System.out.println(operation.getResult());

        System.out.println("------done------");
    }
    
}
