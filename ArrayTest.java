public class ArrayTest{
    public static void main(String[] args){
        String[][] name={{"Zhaoyi","Qianer","Sunsan"},{"Lisi","Zhouwu","Wuliu"}};
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.println(i+" "+j+" "+name[i][j]);
            }
        }
    }
}