package club.yuxuan.yun.xuans.designmode.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    
    private List<BaseElement> elementList = new ArrayList<>();
    
    public void attach(BaseElement element) {
        elementList.add(element);
    }
    
    public void detach(BaseElement element) {
        elementList.remove(element);
    }
    
    public void accept(BaseVisitor visitor) {
        for (BaseElement element : elementList) {
            element.accept(visitor);
        }
    }
    
}
