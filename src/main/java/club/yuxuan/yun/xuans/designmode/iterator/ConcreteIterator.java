package club.yuxuan.yun.xuans.designmode.iterator;

public class ConcreteIterator<T> extends Iterator<T> {
    
    private ConcreteAggregate<T> aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate<T> aggregate) {
        super();
        this.aggregate = aggregate;
    }

    @Override
    public T first() {
        return aggregate.get(0);
    }

    @Override
    public T next() {
        T res = null;
        current++;
        if (current < aggregate.size()) {
            res = aggregate.get(current);
        }
        return res;
    }

    @Override
    public boolean isDone() {
        return current >= aggregate.size();
    }

    @Override
    public T currentItem() {
        return aggregate.get(current);
    }
    
}
