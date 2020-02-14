public class Draw{
    public static void main(String[] args){
        int num = 2;
        switch(num){
            case 1:
                System.out.println("Congrats on winning the 1st prize.");
                break;
            case 2:
                System.out.println("Congrats on winning the 2nd prize.");
                break;
            case 3:
                System.out.println("Congrats on winning the 3rd prize.");
                break;
            default:
                System.out.println("Lose, come again next time.");
        }
    }
}