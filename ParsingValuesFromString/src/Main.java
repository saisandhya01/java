public class Main {
    public static void main(String[] args) {
        String numberAsString = "2018";
        String numberAsString2 = "2018.2345";
        System.out.println(numberAsString);
        int number = Integer.parseInt(numberAsString);
        double d = Double.parseDouble(numberAsString2);
        System.out.println(d);

        numberAsString += 1;
        number += 1;

        System.out.println("after adding 1");
        System.out.println(numberAsString);
        System.out.println(number);
    }
}