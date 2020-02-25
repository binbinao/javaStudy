public class Test{
    public<T,S extends T> T testDemo(T t,S s){
        System.out.println("I am type T, my type is "+t.getClass().getName());
        System.out.println("I am type S, my type is "+s.getClass().getName());
        return t;
    }

    public static void main(String[] args){
        Test test = new Test();
        Dog d = new Dog();
        Animal a0 = new Animal();
        Animal a1 = test.testDemo(a0, d);
        System.out. println("I'm integer a, my type is "+a1.getClass().getName());
    }
}