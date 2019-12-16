package club.yuxuan.yun.xuans.designmode.factory.abstract_;

import club.yuxuan.yun.xuans.designmode.factory.abstract_.department.Department;
import club.yuxuan.yun.xuans.designmode.factory.abstract_.department.IDepartment;
import club.yuxuan.yun.xuans.designmode.factory.abstract_.factory.IFactory;
import club.yuxuan.yun.xuans.designmode.factory.abstract_.factory.MySqlFactory;
import club.yuxuan.yun.xuans.designmode.factory.abstract_.user.IUser;
import club.yuxuan.yun.xuans.designmode.factory.abstract_.user.User;
import club.yuxuan.yun.xuans.designmode.factory.simple_abstract.SimpleAbstractFactoryMain;

/**
 * 抽象工厂模式
 *      提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
 * 
 * 优点：
 *      1.易于交换产品系列，由于具体工厂类在一个应用中只需要在初始化的时候出现一次，
 *          就使改变一个应用的具体工厂变得非常容易，它只需要改变具体工厂即可使用不同的产品配置。
 *      2.让具体的创建实例过程与客户端分离，客户端是通过它们的抽象接口操纵实例，
 *          产品的具体类名也被具体工厂的实现分离，不会出现在客户代码中。
 *          
 * 缺点：
 *      如果需要增加新的操作表(比如Project项目表)
 *      那就至少需要添加三个类: 
 *          IProject
 *          MySqlProject
 *          OracleProject
 *      还需要更改IFactory、MySqlFactory、OracleFactory
 *      才可以完全实现
 * 解决办法：
 *      用简单工厂模式来改进抽象工厂模式
 * @see club.yuxuan.yun.xuans.designmode.factory.simple_abstract.SimpleAbstractFactoryMain
 *
 * @author yuxuan.han
 * @date 2019/12/17 01:13
 **/
public class AbstractFactoryMain {

    public static void main(String[] args) {
        User user = new User(123L, "newUser");
        Department department = new Department(456L, "newDepartment");

//        IFactory factory = new OracleFactory();
        IFactory factory = new MySqlFactory();

        IUser iUser = factory.createUser();
        iUser.insert(user);
        User user1 = iUser.getUser(1L);
        System.out.println(user1);

        System.out.println();

        IDepartment iDepartment = factory.createDepartment();
        iDepartment.insert(department);
        Department department2 = iDepartment.getDepartment(2L);
        System.out.println(department2);

        System.out.println("------done------");
    }
    
}
