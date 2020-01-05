package club.yuxuan.yun.xuans.designmode.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    
    private List<Element> elementList = new ArrayList<>();
    
    public void attach(Element element) {
        elementList.add(element);
    }
    
    public void detach(Element element) {
        elementList.remove(element);
    }
    
    public void accept(Visitor visitor) {
        for (Element element : elementList) {
            element.accept(visitor);
        }
    }
    
}
