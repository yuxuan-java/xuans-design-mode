package club.yuxuan.yun.xuans.designmode.memento.memento2;

public class Memento2Main {

    public static void main(String[] args) {
        Originator2 originator = new Originator2();
        originator.setState("On");
        originator.show();

        Caretaker2<Memento2> caretaker = new Caretaker2<>();
        caretaker.setMemento2(originator.createMemento());

        originator.setState("Off");
        originator.show();

        originator.setMemento(caretaker.getMemento2());
        originator.show();

        System.out.println("------done------");
    }
    
}
