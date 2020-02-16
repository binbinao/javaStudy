public class Test{
    public static void main(String[] args){
        int[] a1={1,2,3};
        int[] a2;

        a2=a1;

        for(int i=0; i<a2.length; i++){
            a2[i]++;
        }
        for(int i=0; i<a1.length; i++){
            System.out.println(a1[i]);
        }
    }
}

//好大一个坑啊，数组赋值，居数组相等了。