package club.yuxuan.yun.xuans.designmode.flyweight;

import java.util.Hashtable;
import java.util.UUID;

public class FlyweightFactory {
    
    private static volatile Hashtable<String, Flyweight> flyweights = new Hashtable<>(4);
    
    public Flyweight getFlyweight(String key) {
        if (!flyweights.containsKey(key)) {
            synchronized (FlyweightFactory.class) {
                if (!flyweights.contains(key)) {
                    ConcreteFlyweight concreteFlyweight = new ConcreteFlyweight(UUID.randomUUID().toString());
                    flyweights.put(key, concreteFlyweight);
                    System.out.println("Create ConcreteFlyweight " + concreteFlyweight.getName());
                }
            }
        }
        return flyweights.get(key);
    }
    
    public int getFlyweightCount() {
        return flyweights.size();
    }
    
}
