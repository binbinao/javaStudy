public class Test{
    public static void main(String[] args){
        Animal a = new Animal();
        Dog d = new Dog();
        Animal b = new Dog();

        a.legNum = 4;
        a.bark();
        d.bark();
        b.bark();
    }
}