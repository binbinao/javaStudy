public class TestFun{
    void f(int i){
        System.out.println("i="+i);
    }

    void f(float f){
        System.out.println("f="+f);
    }

    void f(String s){
        System.out.println("s="+s);
    }

    void f(String s1, String s2){
        System.out.println("s1+s2="+(s1+s2));
    }

    void f(String s, int i){
        System.out.println("s="+s+", i="+i);
    }

    public static void main(String[] args){
        TestFun testFun = new TestFun();
        testFun.f(3456);
        testFun.f(34.56f);
        testFun.f("abc");
        testFun.f("abc", "def");
        testFun.f("abc",3456);
    }
}