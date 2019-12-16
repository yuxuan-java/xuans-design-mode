package club.yuxuan.yun.xuans.designmode.factory.abstract_.factory;

import club.yuxuan.yun.xuans.designmode.factory.abstract_.department.IDepartment;
import club.yuxuan.yun.xuans.designmode.factory.abstract_.department.MySqlDepartment;
import club.yuxuan.yun.xuans.designmode.factory.abstract_.user.IUser;
import club.yuxuan.yun.xuans.designmode.factory.abstract_.user.MySqlUser;

/**
 * 负责实例化MySQL的User和Department
 *
 * @author yuxuan.han
 * @date 2019/12/17 01:31
 **/
public class MySqlFactory implements IFactory {
    
    @Override
    public IUser createUser() {
        return new MySqlUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new MySqlDepartment();
    }
    
}
