public class ScoreJudge{
    public static void main(String[] args){
        int score = 95;
        if(score >= 60){
            if(score>=80){
                if(score>=90){
                    System.out.println("Excellent");
                }
                else{
                System.out.println("Good");
                }
            }
            else{
                System.out.println("Pass");
            }
        }
        else{
            System.out.println("Fail");
        }
    }
}