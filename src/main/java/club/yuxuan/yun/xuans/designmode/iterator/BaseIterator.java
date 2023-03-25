package club.yuxuan.yun.xuans.designmode.iterator;

/**
 * 迭代器抽象类
 *
 * @author yuxuan.han
 * @date 2019/12/24 21:48
 **/
public abstract class BaseIterator<T> {
    
    public abstract T first();
    public abstract T next();
    public abstract boolean isDone();
    public abstract T currentItem();
    
}
