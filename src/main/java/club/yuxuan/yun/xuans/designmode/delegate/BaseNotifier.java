package club.yuxuan.yun.xuans.designmode.delegate;

import lombok.Getter;

import java.lang.reflect.InvocationTargetException;

@Getter
abstract class BaseNotifier {
    
    private DelegateEventHandler delegateEventHandler = new DelegateEventHandler();

    public abstract void addListener(Object object, String methodName, Object... args);
    
    public abstract void notifyX() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException;
    
}
