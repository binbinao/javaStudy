public class People{
    public void peopleInfo(){
        final String sex="man";
        class Student{
            String ID = "20151234";
            public void print(){
                System.out.println("Access external class static sex: "+sex);
                System.out.println("Access internal class variable ID: "+ID);
            }
        }

        Student a = new Student();
        a.print();
    }

    public void peopleInfo2(boolean b){
        if(b){
            final String sex = "man";
            class Student{
                String ID = "20151234";
                public void print(){
                    System.out.println("Access external class static sex: "+sex);
                    System.out.println("Access internal class variable ID: "+ID);
                }
            }
            Student a = new Student();
            a.print();
        }
    }

    public static void main(String[] args){
        People b = new People();
        System.out.println("Define in the menthod internal: ========");
        b.peopleInfo();
        System.out.println("Define in the function area internal: ========");
        b.peopleInfo2(true);
    }
}