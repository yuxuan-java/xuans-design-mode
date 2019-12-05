package club.yuxuan.yun.xuans.designmode.delegate;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * 事件执行器
 *
 * @author yuxuan.han
 * @date 2019/12/5 23:33
 **/
class DelegateEventHandler {
    
    private List<DelegateEvent> eventList;

    public DelegateEventHandler() {
        this.eventList = new ArrayList<>();
    }
    
    public void addEvent(Object object, String methodName, Object... args) {
        eventList.add(new DelegateEvent(object, methodName, args));
    }
    
    public void notifyX() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        for (DelegateEvent event : eventList) {
            event.invoke();
        }
    }
    
}
