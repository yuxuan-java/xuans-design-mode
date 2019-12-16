package club.yuxuan.yun.xuans.designmode.facade;

/**
 * 外观类
 *
 * @author yuxuan.han
 * @date 2019/12/17 00:21
 **/
public class Facade {
    
    SubSystem1 system1;
    SubSystem2 system2;
    SubSystem3 system3;
    SubSystem4 system4;

    public Facade() {
        system1 = new SubSystem1();
        system2 = new SubSystem2();
        system3 = new SubSystem3();
        system4 = new SubSystem4();
    }
    
    public void methodA() {
        System.out.println("方法组A: ");
        system1.method1();
        system2.method2();
        system4.method4();
    }
    
    public void methodB() {
        System.out.println("方法组B: ");
        system2.method2();
        system3.method3();
    }
    
}
