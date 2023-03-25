package club.yuxuan.yun.xuans.designmode.composite;

public abstract class BaseComponent {
    
    protected String name;
    
    public BaseComponent(String name) {
        this.name = name;
    }
    
    public abstract void add(BaseComponent component);
    
    public abstract void remove(BaseComponent component);
    
    public abstract void display(int depth);
    
}
