package club.yuxuan.yun.xuans.designmode.visitor.double_dispatch;

/**
 * 访问者模式-双分派技术
 *      首先在客户端程序中将具体状态作为参数传递给'Man'类完成了一次分派，
 *      然后'Man'类调用作为参数的'Action'中的方法'getConclusion'，
 *      同时将自己(Person)作为参数传递进去，完成了第二次分派。
 *      
 *      双分派意味着得到执行的操作决定于请求的种类和两个接收者的类型。
 *      'accept'方法就是一个双分派的操作，它得到执行的操作不仅决定于'Action'类的具体动作，
 *      还决定于它访问的'Person'的类别。
 *      
 *      由于使用了双分派技术，需要增加'结婚'的动作来考察'男人'和'女人'的反应时
 *      只需要增加一个Action子类，就可以在客户端调用来查看，不需要改变其它任何类的代码。
 *      完美的体现了开放-封闭原则。
 *
 * @author yuxuan.han
 * @date 2020/1/1 23:40
 **/
public class DoubleDispatchMain {

    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.attach(new Man());
        structure.attach(new Woman());
        System.out.println();
        
        //  成功时的反应
        Action a1 = new Success();
        structure.display(a1);
        System.out.println();
        
        //  失败时的反应
        Action a2 = new Failing();
        structure.display(a2);
        System.out.println();
        
        //  恋爱时的反应
        Action a3 = new Amativeness();
        structure.display(a3);
        System.out.println();
        
        //  结婚时的反应
        Action a4 = new Marriage();
        structure.display(a4);
        System.out.println();
        
        System.out.println("------done------");
    }
    
}
