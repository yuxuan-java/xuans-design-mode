package club.yuxuan.yun.xuans.designmode.factory.abstract_.factory;

import club.yuxuan.yun.xuans.designmode.factory.abstract_.department.IDepartment;
import club.yuxuan.yun.xuans.designmode.factory.abstract_.user.IUser;

public interface IFactory {
    
    IUser createUser();
    
    IDepartment createDepartment();
    
}
