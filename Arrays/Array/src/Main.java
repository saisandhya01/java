import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myArr2 = new int[15];
        myArr2[5] = 50;
        System.out.println(myArr2[5]);

        int[] myarr = {1, 2, 3, 4, 5, 6, 7, 80};
        System.out.println(myarr[0]);

        int[] myArr3 = new int[10];
        for(int i=0; i<myArr3.length; i++){
            myArr3[i] = i*10;
        }
        printArr(myArr3);

        System.out.println("next part");

        int[] myIntegers = getIntegers(5);
        printArr(myIntegers);

        System.out.println("Average of these integers are: " + getAverage(myIntegers));
    }
    public static int[] getIntegers(int n){
       int arr[] = new int[n];
        System.out.println("Enter " + n + " numbers: \r");
       for(int i=0; i<n; i++){
           arr[i] = scanner.nextInt();
       }
       return arr;
    }
    public static void printArr(int[] array){
        System.out.println("In printarr method..");
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static double getAverage(int[] array){
        double sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        return sum / array.length;
    }
}