public class SumOfEven{
    public static void main(String[] args){
        int i1=1,i2=1;
        int sum1=0,sum2=0;

        while(i1<=1000){
            if(i1%2==0){
                sum1+=i1;
            }
            i1++;
        }
        System.out.println("the result is "+sum1);

        do{
            if(i2%2==0){
                sum2+=i2;
            }
            i2++;
        }while(i2<=1000);
        System.out.println("the result is "+sum2);
    }
}