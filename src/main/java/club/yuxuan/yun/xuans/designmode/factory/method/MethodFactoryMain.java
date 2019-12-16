package club.yuxuan.yun.xuans.designmode.factory.method;

import club.yuxuan.yun.xuans.designmode.factory.simple.Operation;

import java.math.BigDecimal;

/**
 * 工厂方法模式
 *      简单工厂模式最大的有点在于工厂类中包含了必要的逻辑判断，根据客户端的选择条件动态实例化相关的类，对于客户端来说，去除了与具体产品的依赖。
 *      工厂方法模式，定义一个用户创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类。
 *      
 *      工厂方法模式实现时，客户端需要决定实例化哪一个工厂来实现运算类，选择判断的问题还是存在的，
 *          也就是说，工厂方法把简单工厂的内部逻辑判断转移到了客户端代码来进行。
 *
 * @author yuxuan.han
 * @date 2019/12/16 23:39
 **/
public class MethodFactoryMain {

    public static void main(String[] args) {
        IFactory operationFactory = new AddFactory();
        Operation operation = operationFactory.createOperation();
        operation.setNumberA(new BigDecimal("1"));
        operation.setNumberB(new BigDecimal("2"));
        System.out.println(operation.getResult());

        System.out.println("------done------");
    }
    
}
