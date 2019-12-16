package club.yuxuan.yun.xuans.designmode.factory.abstract_.user;

public class OracleUser implements IUser {
    
    @Override
    public void insert(User user) {
        System.out.println("在Oracle中给User表增加一条记录: " + user);
    }

    @Override
    public User getUser(Long id) {
        System.out.println("在Oracle根据ID: " + id + "得到User的一条记录");
        return new User(id, "OracleUser");
    }
    
}
