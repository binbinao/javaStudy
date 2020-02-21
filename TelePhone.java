public abstract class TelePhone{
    public abstract void call();
    public abstract void message();
}

public class CellPhone extends TelePhone{
    public void call(){
        System.out.println("I can call.");
    }

    public void message(){
        System.out.println("I can send message.");
    }

    public static void main(){
        CellPhone cp = new CellPhone();

        cp.call();
        cp.message();
    }
}