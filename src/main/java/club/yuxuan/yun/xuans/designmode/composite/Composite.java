package club.yuxuan.yun.xuans.designmode.composite;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 在组合中表示 枝节点 对象
 *
 * @author yuxuan.han
 * @date 2019/12/23 22:26
 **/
public class Composite extends Component {
    
    private List<Component> children = new LinkedList<>();
    
    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        
        for (Component component : children) {
            component.display(depth + 2);
        }
    }
    
}
