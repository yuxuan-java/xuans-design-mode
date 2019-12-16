package club.yuxuan.yun.xuans.designmode.factory.abstract_.factory;

import club.yuxuan.yun.xuans.designmode.factory.abstract_.department.IDepartment;
import club.yuxuan.yun.xuans.designmode.factory.abstract_.department.MySqlDepartment;
import club.yuxuan.yun.xuans.designmode.factory.abstract_.department.OracleDepartment;
import club.yuxuan.yun.xuans.designmode.factory.abstract_.user.IUser;
import club.yuxuan.yun.xuans.designmode.factory.abstract_.user.MySqlUser;
import club.yuxuan.yun.xuans.designmode.factory.abstract_.user.OracleUser;

/**
 * 负责实例化MySQL的User和Department
 *
 * @author yuxuan.han
 * @date 2019/12/17 01:31
 **/
public class OracleFactory implements IFactory {
    
    @Override
    public IUser createUser() {
        return new OracleUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new OracleDepartment();
    }
    
}
