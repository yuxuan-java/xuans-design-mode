package club.yuxuan.yun.xuans.designmode.iterator;

/**
 * 聚集抽象类
 *
 * @author yuxuan.han
 * @date 2019/12/24 21:49
 **/
public abstract class Aggregate<T> {

    /**
     * 创建迭代器
     *
     * @author yuxuan.han
     * @date 2019/12/24 21:49 
     * @param 
     * @return club.yuxuan.yun.xuans.designmode.iterator.Iterator
     */
    public abstract Iterator<T> createIterator();
    
    public abstract T get(int index);
    
    public abstract void add(T value);
    
    public abstract int size();
    
}
