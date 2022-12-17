import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println(a);
        System.out.println(b);

        b++;

        System.out.println(a);
        System.out.println(b);

        int[] myIntArray = new int[5]; //reference types
        //here it points to some address
        int[] anotherArray = myIntArray; //points to the same address of myIntArray

        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherArray));

        anotherArray[1] = 1;

        System.out.println("after change:");

        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherArray));

        modifyArray(myIntArray); //pass the reference type

        System.out.println("after modifying:");

        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherArray));
    }
    private static void modifyArray(int[] array){
        array[0] = 2;
    }
}