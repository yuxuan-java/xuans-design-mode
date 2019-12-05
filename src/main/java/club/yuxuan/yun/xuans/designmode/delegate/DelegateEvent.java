package club.yuxuan.yun.xuans.designmode.delegate;

import lombok.Data;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 委托事件
 *
 * @author yuxuan.han
 * @date 2019/12/5 23:25
 **/
@Data
class DelegateEvent {
    
    private Object object;
    
    private String methodName;
    
    private Object[] params;
    
    private Class[] paramTypes;

    public DelegateEvent(Object object, String methodName, Object[] params) {
        this.object = object;
        this.methodName = methodName;
        this.params = params;
        initParamTypes(this.params);
    }

    private void initParamTypes(Object[] params) {
        this.paramTypes = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            this.paramTypes[i] = params[i].getClass();
        }
    }
    
    public void invoke() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = object.getClass().getMethod(methodName, paramTypes);
        if (method == null) {
            return;
        }
        method.invoke(object, params);
    }
    
}
