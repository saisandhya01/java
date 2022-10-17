public class Main {
    public static void main(String[] args) {
      // this is a method
        //you can't put another method inside a method
        /*
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Final Score: " + highScore);
        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Final Score: " + highScore);
         */
        displayHighScorePosition("Tim", calculateHighScorePosition(1500));
        displayHighScorePosition("Lok", calculateHighScorePosition(900));
        displayHighScorePosition("Sai", calculateHighScorePosition(400));
        displayHighScorePosition("Rak", calculateHighScorePosition(50));
    }
    public static int calculateHighScorePosition(int score){
        if(score >= 1000){
            return 1;
        }
        else if(score >= 500){
            return 2;
        }
        else if(score >= 100){
            return 3;
        }
        return 4;
    }
    public static void displayHighScorePosition(String name, int position){
        //method returning nothing is called proceedure
        System.out.println(name + " managed to get into position " + position);
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }
}