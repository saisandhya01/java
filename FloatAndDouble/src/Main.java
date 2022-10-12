public class Main {
    public static void main(String[] args) {
       float myMinFloatValue = Float.MIN_VALUE;
       float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min value: " + myMinFloatValue);
        System.out.println("Float max value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min value: " + myMinDoubleValue);
        System.out.println("Double max value: " + myMaxDoubleValue);

        int myIntValue = 5 /3;
        //float myFloatValue = 5.25; //gives error
        //java assumes it is double. java uses double as default - important
        float myFloatValue = 5f /3f;
        float mySecondFloatValue = (float)5.25; //or 5.25f;
        double myDoubleValue = 5d /3d;

        System.out.println("Myintvalue: " + myIntValue);
        System.out.println("Myfloatvalue: " + myFloatValue);
        System.out.println("My double value: " + myDoubleValue);

        //challenge
        //pounds to kilograms
        double pounds = 23;
        double kilograms = pounds * 0.45359237;
        System.out.println(kilograms);
    }
}