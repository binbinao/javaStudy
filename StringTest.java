public class StringTest{
    public static void main(String[] args){
        String s = new String("Java");
        String m = "java";
        System.out.println("use equals() to compare java and Java, and the result is "+s.equals(m));
        System.out.println("use equalsIgnoreCase() to compare java and Java, and the result is "+s.equalsIgnoreCase(m));
    }
}