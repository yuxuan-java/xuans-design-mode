package club.yuxuan.yun.xuans.designmode.test;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Model1 implements Iterable {
    
    @Override
    public Iterator iterator() {
        
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        
    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
    
}
