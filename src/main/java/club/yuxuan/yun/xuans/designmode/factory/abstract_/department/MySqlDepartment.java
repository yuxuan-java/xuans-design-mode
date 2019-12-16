package club.yuxuan.yun.xuans.designmode.factory.abstract_.department;

/**
 * 操作MySQL的部门
 *
 * @author yuxuan.han
 * @date 2019/12/17 01:16
 **/
public class MySqlDepartment implements IDepartment {
    
    @Override
    public void insert(Department department) {
        System.out.println("在MySQL中给Department增加一条记录: " + department);
    }

    @Override
    public Department getDepartment(Long id) {
        System.out.println("在MySQL中根据ID: " + id + "得到Department的一条记录");
        return new Department(id, "MySqlDepartment");
    }
    
}
