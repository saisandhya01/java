public class Main {
    public static void main(String[] args) {
       int myValue = 10000;
       int myIntMinValue = Integer.MIN_VALUE;
       int myIntMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer min value: " + myIntMinValue);
        System.out.println("Integer max valus: " + myIntMaxValue);
        System.out.println("Busted max value: " + (myIntMaxValue + 1)); //overflow
        //changes to negative above

        System.out.println("Busted min value: " + (myIntMinValue - 1)); //underflow
        //changes to positive large value

        int myMaxIntTest = 2147483647;
        //int myMaxIntTest = 2_147_483_647; //also valid

        byte myByteMinValue = Byte.MIN_VALUE;
        byte myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("Byte min value: " + myByteMinValue);
        System.out.println("Byte max value: " + myByteMaxValue);

        short myShortMinValue = Short.MIN_VALUE;
        short myShortMaxValue = Short.MAX_VALUE;
        System.out.println("Short min value: " + myShortMinValue);
        System.out.println("Short max value: " + myShortMaxValue);

        //byte: 8 bits
        //short: 16 bits
        //int: 32 bits
        //long: 64 bits

        long myLongValue = 100L;
        long myLongMinValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;
        System.out.println("Long min value: " + myLongMinValue);
        System.out.println("Long max value: " + myLongMaxValue);

        long myLongIntTest = 2_147_483_648L; //suffix with L

        int myTotal = (myIntMinValue/2);
        //byte myNewByteValue = (myByteMinValue / 2); ->error
        byte myNewByteValue = (byte) (myByteMinValue / 2); //casting
        //java uses int most of the time
    }
}