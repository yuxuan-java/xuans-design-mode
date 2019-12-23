package club.yuxuan.yun.xuans.designmode.composite;

/**
 * 组合模式
 *      将对象组合成树形结构以表示'部分-整体'的层次结构。
 *      组合模式使得用户对单个对象和组合对象的使用具有一致性。
 *      
 *      透明方式，就是说在Component中生命所有用来管理子对象的方法，其中包括add、remove等。
 *      这样实现Component接口的所有子类都具备了add()和remove()。
 *      这样做的好处就是叶节点和枝节点对于外界没有区别，它们具备完全一致的行为接口。
 *      但是问题也很明显，因为Leaf类本身不具备add()、remove()，所以实现这两个方法是没有意义的。
 *      
 *      安全方式，就是在Component接口中不去声明add()和remove()方法，所以子类的Leaf也不需要去实现，
 *      而是在Composite声明所有用来管理子类对象的方法。
 *      不过由于这样做不够透明，所以树叶和树枝类将不具有相同的接口，客户端的调用需要做相应的判断，带来了不便。
 *      
 *      当发现需求中是提现部分与整体层次的结构时，或者希望用户可以忽略组合对象与单个对象的不同，
 *      统一地使用组合结构中的所有对象时，就应该考虑使用组合模式了。
 *      
 *      组合模式，定义了包含基本对象和组合对象的类层次结构。
 *      基本对象可以被组合成更复杂的组合对象，而这个对象又可以被组合，这样不断地递归下去，
 *      客户端代码中，任何用到基本对象的地方都可以使用组合对象了。
 *      客户端不需要关心到底是处理一个叶节点还是处理一个组合组件，也就不用为定义组合而写一些选择判断语句了。
 *      组合模式让客户可以一致的使用组合结构和单个对象。
 *
 * @author yuxuan.han
 * @date 2019/12/23 22:07
 **/
public class CompositeMain {

    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("A"));
        root.add(new Leaf("B"));
        
        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));
        root.add(comp);
        
        Composite comp2 = new Composite("Composite XY");
        comp2.add(new Leaf("Leaf XYA"));
        comp2.add(new Leaf("Leaf XYB"));
        comp.add(comp2);
        
        root.add(new Leaf("Leaf C"));
        
        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);
        
        root.display(1);

        System.out.println("------done------");
    }
    
}
