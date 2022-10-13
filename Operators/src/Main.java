public class Main {
    public static void main(String[] args) {
        //abbreviating operators
        int result = 1;
        result++;
        System.out.println(result);

        result--;
        System.out.println(result);

        result += 2;
        System.out.println(result);

        result *= 10;
        System.out.println(result);

        boolean isAlien = false;
        if(isAlien == false)
            System.out.println("It is not a Alien!");

        int topScore = 100;
        //!=
        //>, <
        //>=, <=
        if(topScore > 100){
            System.out.println("You got the high score!");
        }
        //logical and operator
        int secondTopScore = 60;
        if(topScore < secondTopScore && secondTopScore < 100){
            System.out.println("this is second top score");
        }
        //logical or operator
        if((topScore > 120) || (secondTopScore < 70)){
            System.out.println("either or both conditions are working");
        }
        //assignment vs equal to operators
        // = vs ==

        int newValue = 50;
        if(newValue == 50){
            System.out.println("Hey it is working");
        }

        boolean isCar = false;
        if(isCar){
            System.out.println("This is not supposed to happen.");
            //this will work because it returns true in if statement
        }

        //ternary operator
        boolean wasCar = isCar ? true : false;

        //summary of operators
        //https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html

        //java operator precedence table - https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html

        //operators challenge
        double d1 = 20.00;
        double d2 = 80.00;
        double d3 = (d1 + d2) * 100;
        double rem = d3 % 40.00;
        boolean ans = rem == 0 ? true : false;
        System.out.println(ans);
        if(!ans){
            System.out.println("Got some reminder");
        }
    }
}