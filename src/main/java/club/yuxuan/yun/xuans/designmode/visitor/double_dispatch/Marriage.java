package club.yuxuan.yun.xuans.designmode.visitor.double_dispatch;

/**
 * 结婚
 *
 * @author yuxuan.han
 * @date 2020/1/2 00:06
 **/
public class Marriage extends Action {
    
    @Override
    public void getConclusion(Man man) {
        System.out.println(man.getClass().getSimpleName() + " " +
                this.getClass().getSimpleName() +
                "时，感慨道：恋爱游戏终结时，'有妻徒刑'遥遥无期.");
    }

    @Override
    public void getConclusion(Woman woman) {
        System.out.println(woman.getClass().getSimpleName() + " " +
                this.getClass().getSimpleName() +
                "时，欣慰曰：爱情长跑路漫漫，婚姻保险保平安.");
    }
    
}
