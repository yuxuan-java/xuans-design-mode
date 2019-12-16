package club.yuxuan.yun.xuans.designmode.factory.abstract_.department;

/**
 * 定义部门的操作
 *
 * @author yuxuan.han
 * @date 2019/12/17 01:16
 **/
public interface IDepartment {
    
    void insert(Department department);
    
    Department getDepartment(Long id);
    
}
