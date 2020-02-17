public class People{
    double height;
    int age;
    int sex;

    void cry(){
        System.out.println("Crying!");
    }

    void laugh(){
        System.out.println("Laughing!");
    }

    void printBaseMes(){
        System.out.println("My height is "+height+"cm.");
        System.out.println("My age is "+age+".");
        if(this.sex==0)
            System.out.println("I'm Male");
        else
            System.out.println("I'm Female");
    }
}