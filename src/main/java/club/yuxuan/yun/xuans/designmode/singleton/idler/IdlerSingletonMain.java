package club.yuxuan.yun.xuans.designmode.singleton.idler;

/**
 * 单例模式 (懒汉)
 *      保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 *      
 *      所有类都有构造方法，不编码则系统默认生成空的构造方法，若有显示定义的构造方法，默认的构造方法就会失效。
 *      
 *      通常我们可以用一个全局变量使得一个对象被全局访问，但它不能防止你实例化多个对象。
 *      一个最好的办法就是，让类资深负责保存它的唯一实例，这个类可以保证没有其它实例可以被创建，并且它可以提供一个访问该实例的方法。
 *      
 *      单例模式因为Singleton类封装它的唯一实例，这样它可以严格地控制客户怎样访问它以及何时访问它。
 *      简单地说就是对唯一实例的受控访问。
 *
 * @author yuxuan.han
 * @date 2019/12/24 22:16
 **/
public class IdlerSingletonMain {

    public static void main(String[] args) {
        IdlerSingleton s1 = IdlerSingleton.getInstance();
        IdlerSingleton s2 = IdlerSingleton.getInstance();
        
        if (s1 == s2) {
            System.out.println("两个对象的实例相同.");
        }

        System.out.println("------done------");
    }
    
}
