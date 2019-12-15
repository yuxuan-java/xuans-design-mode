package club.yuxuan.yun.xuans.designmode.state;

/**
 * 状态模式
 *
 * @author yuxuan.han
 * @date 2019/12/15 18:10
 **/
public class StateMain {

    public static void main(String[] args) {
        Context c = new Context(new ConcreteStateA());
        c.request();
        c.request();
        c.request();
        c.request();

        System.out.println("------done------");
    }
    
}
