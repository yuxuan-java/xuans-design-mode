package club.yuxuan.yun.xuans.designmode.delegate;

import java.lang.reflect.InvocationTargetException;

class GoodNotifier extends Notifier {
    
    @Override
    public void addListener(Object object, String methodName, Object... args) {
        System.out.println("收到 " + object + " -> " + methodName + " 委托GoodNotifier.");
        this.getDelegateEventHandler().addEvent(object, methodName, args);
    }

    @Override
    public void notifyX() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        System.out.println("GoodNotifier-notifyX execute.");
        this.getDelegateEventHandler().notifyX();
    }
    
}
