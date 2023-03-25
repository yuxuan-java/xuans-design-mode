package club.yuxuan.yun.xuans.designmode.factory.simple;

/**
 * 计算器简单工厂
 *
 * @author yuxuan.han
 * @date 2019/12/16 22:30
 **/
public class OperationFactory {
    
    /**
     * 获取计算实例
     *
     * @author yuxuan.han
     * @date 2019/12/16 22:31 
     * @param operate
     * @return club.yuxuan.yun.xuans.designmode.factory.simple.Operation
     */
    public static BaseOperation createOperate(String operate) {
        BaseOperation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                break;
        }
        return operation;
    }
    
}
