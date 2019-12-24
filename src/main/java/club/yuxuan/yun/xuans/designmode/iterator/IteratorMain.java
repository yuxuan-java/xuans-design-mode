package club.yuxuan.yun.xuans.designmode.iterator;

/**
 * 迭代器模式
 *      提供一种方法顺序访问同一个聚合对象中各个元素，而又不暴露该对象的内部表示。
 *      当需要访问一个聚焦对象，而且不管这些对象是什么都需要遍历的时候，就应该考虑使用迭代器模式
 *      或需要对聚焦有多种方式遍历时，可以考虑用迭代器模式
 *      为遍历不同的聚焦结构提供如开始、下一个、是否结束、当前是哪一项等统一的接口。
 *      
 *      迭代器模式就是分离了集合对象的遍历行为，抽象出一个迭代器来负责，
 *      这样既可以不暴露集合的内部结构，又可以让外部代码透明地访问集合内部的数据。
 *
 * @author yuxuan.han
 * @date 2019/12/23 23:04
 **/
public class IteratorMain {

    public static void main(String[] args) {
        ConcreteAggregate<String> aggregate = new ConcreteAggregate();
        aggregate.add("大鸟");
        aggregate.add("小菜");
        aggregate.add("行李");
        aggregate.add("老外");
        aggregate.add("公交内部员工");
        aggregate.add("小偷");
        
        Iterator<String> iterator = new ConcreteIterator(aggregate);
        String first = iterator.first();
        System.out.println(first);
        
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem() + " 请买车票!");
            iterator.next();
        }

        System.out.println("------done------");
    }
    
}
