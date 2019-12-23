package club.yuxuan.yun.xuans.designmode.memento;
/**
 * 备忘录模式
 *      在不破坏封装性的前提下，获取一个对象的内部状态，并在该对象之外保存这个状态。
 *      这样以后就可以将该对象获取到原先保存的状态
 *      要保存的细节都封装在了Memento中，如果要更改保存的细节，不需要影响客户端代码。
 *      
 *      Memento模式比较适用于功能比较复杂的，但需要维护或记录属性历史的类
 *      或者需要保存的属性只是众多属性中的一小部分时，Originator可以genuine保存的Memento信息还原到前一个状态
 *      
 *      如果在某个系统中使用命令模式时，需要实现命令的撤销功能，那么命令模式可以使用备忘录模式来存储可撤销操作的状态。
 *      使用备忘录模式可以把复杂的对象内部信息对其他的对象屏蔽起来
 *      当角色的状态改变的时候，有可能这个状态无效，这时候就可以使用暂时存储起来的备忘录将状态复原。
 *
 * @author yuxuan.han
 * @date 2019/12/15 23:08
 **/
public class MementoMain {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("On");
        originator.show();
        
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        
        originator.setState("Off");
        originator.show();

        originator.setMemento(caretaker.getMemento());
        originator.show();

        System.out.println("------done------");
    }
    
}
