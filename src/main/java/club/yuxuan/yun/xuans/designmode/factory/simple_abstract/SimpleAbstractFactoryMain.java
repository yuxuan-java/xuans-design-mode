package club.yuxuan.yun.xuans.designmode.factory.simple_abstract;

import club.yuxuan.yun.xuans.designmode.factory.abstract_.department.Department;
import club.yuxuan.yun.xuans.designmode.factory.abstract_.department.IDepartment;
import club.yuxuan.yun.xuans.designmode.factory.abstract_.user.IUser;
import club.yuxuan.yun.xuans.designmode.factory.abstract_.user.User;

/**
 * 使用简单工厂模式改进抽象工厂模式
 *      改进方案：去除IFactory、MySqlFactory、OracleFactory三个工厂，使用DataAccess简单工厂来取代。
 *
 * @author yuxuan.han
 * @date 2019/12/17 01:47
 **/
public class SimpleAbstractFactoryMain {

    public static void main(String[] args) {
        User user = new User();
        Department department = new Department();

        IUser iu = DataAccess.createUser();
        iu.insert(user);
        iu.getUser(1L);

        System.out.println();

        IDepartment id = DataAccess.createDepartment();
        id.insert(department);
        id.getDepartment(2L);

        System.out.println("------done------");
    }
    
}
