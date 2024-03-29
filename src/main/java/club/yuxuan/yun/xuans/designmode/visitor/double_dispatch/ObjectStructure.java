package club.yuxuan.yun.xuans.designmode.visitor.double_dispatch;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构
 *
 * @author yuxuan.han
 * @date 2020/1/1 23:57
 **/
public class ObjectStructure {
    
    private List<BasePerson> personList = new ArrayList<>();

    /**
     * 增加
     * @param element
     */
    public void attach(BasePerson element) {
        personList.add(element);
    }

    /**
     * 移除
     * @param element
     */
    public void detach(BasePerson element) {
        personList.remove(element);
    }

    /**
     * 查看显示
     * @param action
     */
    public void display(BaseAction action) {
        for (BasePerson person : personList) {
            person.accept(action);
        }
    }
    
}
