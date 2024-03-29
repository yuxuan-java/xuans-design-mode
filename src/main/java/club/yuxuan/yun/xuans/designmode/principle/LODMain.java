package club.yuxuan.yun.xuans.designmode.principle;

/**
 * 迪米特法则(最少知道原则)
 *      如果两个类不必彼此只能通信，那么这两个类就不应当发生直接的相互作用。
 *      如果其中一个类需要调用另一个类的某一个方法的话，可以通过第三者转发这个调用。
 *      
 *      在类的结构设计上，每一个类都应当尽量降低成员的访问权限。
 *      
 *      类之间的耦合越弱，越有利于复用，一个处在弱耦合的类修改，不会波及到有关系的类。
 *
 * @author yuxuan.han
 * @date 2019/12/24 23:14
 **/
public class LODMain {
}
