package club.yuxuan.yun.xuans.designmode.factory.abstract_.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 代表数据库用户
 *
 * @author yuxuan.han
 * @date 2019/12/17 01:24
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    
    private Long id;
    
    private String username;
    
}
