package club.yuxuan.yun.xuans.designmode.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate<T> extends BaseAggregate<T> {
    
    private List<T> items = new ArrayList<>(16);
    
    @Override
    public BaseIterator createIterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public T get(int index) {
        if (items.size() <= index) { return null; }
        
        return items.get(index);
    }

    @Override
    public void add(T value) {
        items.add(value);
    }

    @Override
    public int size() {
        return items.size();
    }

}
