package club.yuxuan.yun.xuans.designmode.adapter;

public class Adapter extends Target {
    
    private Adaptee adaptee = new Adaptee();
    
    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
