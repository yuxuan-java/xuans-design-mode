package club.yuxuan.yun.xuans.designmode.visitor.double_dispatch;

/**
 * 成功
 *
 * @author yuxuan.han
 * @date 2020/1/1 23:49
 **/
public class Success extends Action {
    
    @Override
    public void getConclusion(Man man) {
        System.out.println(man.getClass().getSimpleName() + " " + 
                this.getClass().getSimpleName() + 
                "时，背后多半有一个伟大的女人.");
    }

    @Override
    public void getConclusion(Woman woman) {
        System.out.println(woman.getClass().getSimpleName() + " " +
                this.getClass().getSimpleName() +
                "时，背后大多有一个不成功的男人.");
    }
    
}
