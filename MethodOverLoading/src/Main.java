public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("tim", 500);
        System.out.println(newScore);

        calculateScore(400);
        calculateScore();
        calcFeetAndInchesToCm(6, 0);

        double cms = calcFeetAndInchesToCm(157);
        System.out.println(cms);
    }

    public static double calcFeetAndInchesToCm(double feet, double inches){
        if(feet < 0 || (inches < 0 || inches > 12)){
            return -1;
        }
        double cms = feet * 12 * 2.54;
        cms += (inches * 2.54);
        return cms;
    }
    public static double calcFeetAndInchesToCm(double inches){
        if(inches >= 0){
            double feet = (int) inches / 12;
            double remainingInches  = (int) inches % 12;
            return calcFeetAndInchesToCm(feet, remainingInches);
        }
        return -1;
    }
    public static int calculateScore(String playerName, int score){
        System.out.println(playerName + " has a score of " + score);
        return score * 1000;
    }
    public static int calculateScore(int score){
        System.out.println("Anonymous player has a score of " + score);
        return score * 1000;
    }

    public static int calculateScore(){
        return 0;
    }
    /*
    public static void calculateScore(){

    }*/
}