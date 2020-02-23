public class People{
    private String name = "Lilei";

    static String ID = "510xxx199X0724XXXX";

    public class Student{
        String ID = "20151234";

        public void stuInfo(){
            System.out.println("Access external class name: "+name);
            System.out.println("Access external class ID: "+People.ID);
            System.out.println("Access internal class ID: "+ID);
        }
    }

    public static void main(String[] args){
        People a = new People();
        Student b = a.new Student();

        b.stuInfo();
    }
}