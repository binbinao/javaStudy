public class StringTestSome{
    public static void main(String[] args){
        String s = "abcdefabc";
        System.out.println("The 1st appearance of character a is "+s.indexOf('a'));
        System.out.println("The 1st appearance of string bc is "+s.indexOf("bc"));
        System.out.println("The last appearance of character a is "+s.lastIndexOf('a'));
        System.out.println("The sub string from position 3 to end is "+s.substring(3));
        System.out.println("The sub string from position 3 to 6 is "+s.substring(3,6));
    }
}