package club.yuxuan.yun.xuans.designmode.visitor.double_dispatch;

/**
 * 失败
 *
 * @author yuxuan.han
 * @date 2020/1/1 23:52
 **/
public class Failing extends BaseAction {
    
    @Override
    public void getConclusion(Man man) {
        System.out.println(man.getClass().getSimpleName() + " " +
                this.getClass().getSimpleName() +
                "时，闷头喝酒，谁也不用劝.");
    }

    @Override
    public void getConclusion(Woman woman) {
        System.out.println(woman.getClass().getSimpleName() + " " +
                this.getClass().getSimpleName() +
                "时，眼泪汪汪，谁也劝不了.");
    }
    
}
