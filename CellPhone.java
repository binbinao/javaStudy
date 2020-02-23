public class CellPhone extends Telephone{
    public void call(){
        System.out.println("I can call.");
    }

    public void message(){
        System.out.println("I can message.");
    }

    public static void main(String[] args){
        CellPhone cp = new CellPhone();
        cp.call();
        cp.message();
    }
}