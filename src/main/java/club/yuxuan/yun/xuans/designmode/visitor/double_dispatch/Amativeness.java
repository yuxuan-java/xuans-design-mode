package club.yuxuan.yun.xuans.designmode.visitor.double_dispatch;

/**
 * 恋爱
 *
 * @author yuxuan.han
 * @date 2020/1/1 23:53
 **/
public class Amativeness extends Action {
    
    @Override
    public void getConclusion(Man man) {
        System.out.println(man.getClass().getSimpleName() + " " +
                this.getClass().getSimpleName() +
                "时，凡事不懂也要装懂.");
    }

    @Override
    public void getConclusion(Woman woman) {
        System.out.println(woman.getClass().getSimpleName() + " " +
                this.getClass().getSimpleName() +
                "时，遇事懂也装不懂.");
    }
    
}
