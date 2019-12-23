package club.yuxuan.yun.xuans.designmode.factory.simple_abstract;

import club.yuxuan.yun.xuans.designmode.factory.abstract_.department.IDepartment;
import club.yuxuan.yun.xuans.designmode.factory.abstract_.department.MySqlDepartment;
import club.yuxuan.yun.xuans.designmode.factory.abstract_.department.OracleDepartment;
import club.yuxuan.yun.xuans.designmode.factory.abstract_.user.IUser;
import club.yuxuan.yun.xuans.designmode.factory.abstract_.user.MySqlUser;
import club.yuxuan.yun.xuans.designmode.factory.abstract_.user.OracleUser;

/**
 * 取代IFactory、MySqlFactory、OracleFactory三个抽象工厂的简单工厂
 *
 * @author yuxuan.han
 * @date 2019/12/17 01:51
 **/
public class DataAccess {
    
    private static final String db = "MySQL";
//    private static final String db = "Oracle";
    
    public static IUser createUser() {
        IUser result = null;
        switch (db) {
            case "MySQL":
                result = new MySqlUser();
                break;
            case "Oracle":
                result = new OracleUser();
                break;
        }
        return result;
    }
    
    public static IDepartment createDepartment() {
        IDepartment result = null;
        switch (db) {
                case "MySQL":
                    result = new MySqlDepartment();
                    break;
                case "Oracle":
                    result = new OracleDepartment();
                    break;
        }
        return result;
    }
    
}
