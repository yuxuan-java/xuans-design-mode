package club.yuxuan.yun.xuans.designmode.delegate;

import java.lang.reflect.InvocationTargetException;

class GoodNotifier extends BaseNotifier {
    
    @Override
    public void addListener(Object object, String methodName, Object... args) {
        System.out.println("收到 " + object + " -> " + methodName + " 委托GoodNotifier.");
        this.getDelegateEventHandler().addEvent(object, methodName, args);
    }

    @Override
    public void notifyX() {
        System.out.println("GoodNotifier-notifyX execute.");
        try {
            this.getDelegateEventHandler().notifyX();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    
}
