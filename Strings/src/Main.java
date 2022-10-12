public class Main {
    public static void main(String[] args) {
        String myString = "this is a string";
        System.out.println("Hi: " + myString);
        myString = myString + "this is more";
        System.out.println(myString + "\uA009"); //you can add a unicode char as well

        String number = "23";
        String anotherNumber = "23";
        System.out.println(number + anotherNumber);

        String laststring = "50";
        int no = 10;
        laststring = laststring + no;
        System.out.println(laststring);

        double double_number = 120.47d;
        laststring = laststring + double_number;
        System.out.println(laststring);
    }
}