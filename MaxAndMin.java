public class MaxAndMin{
    public static void main(String[] args){
        int[] data={313,89,123,323,313,15,90,39};
        int max=data[0];
        int min=data[0];

        for(int i=1;i<data.length;i++){
            if(max<data[i]){
                max=data[i];
            }

            if(min>data[i]){
                min=data[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}