import java.util.Scanner;

public class Main {
    private static Scanner scanner  = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("Enter 10 numbers: \r");
        for(int i=0; i< arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        arr = sortArray(arr);

        printArr(arr);
    }
    public static void printArr(int[] array){
        System.out.println("In printarr method..");
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static int[] sortArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i] < arr[j]){
                    //swap
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        return arr;
    }
}