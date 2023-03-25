package club.yuxuan.yun.xuans.designmode.composite;

/**
 * 在组合中表示 叶节点 对象
 *
 * @author yuxuan.han
 * @date 2019/12/23 22:22
 **/
public class Leaf extends BaseComponent {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(BaseComponent component) {
        System.out.println("Can not add to a leaf.");
    }

    @Override
    public void remove(BaseComponent component) {
        System.out.println("Can not remove from a leaf.");
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }
    
}
