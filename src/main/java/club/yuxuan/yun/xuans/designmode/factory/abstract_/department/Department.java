package club.yuxuan.yun.xuans.designmode.factory.abstract_.department;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 部门实体
 *
 * @author yuxuan.han
 * @date 2019/12/17 01:14
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Department {
    
    private Long id;
    
    private String deptName;
    
}
