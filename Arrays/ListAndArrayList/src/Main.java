import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void addItem(){
        System.out.println("Enter a item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }
    public static void modifyItem(){
        groceryList.printGroceryList();
        System.out.println("Enter position you want to modify:");
        int pos = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter new item");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(pos-1, newItem);
    }
    public static void removeItem(){
        System.out.println("Enter position you want to remove:");
        int pos = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(pos);
    }
    public static void searchItem(){
        System.out.println("Enter item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.findItem(searchItem) != null){
            System.out.println(searchItem + " found in grocery list");
        }
        else{
            System.out.println(searchItem + " not found in grocery list");
        }
    }
    public static void main(String[] args) {
        //change array while preserving data
        //ArrayList inherits from AbstractList
        boolean exit = false;
        int choice = 0;
        while(!exit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    exit = true;
                    break;
            }
        }
    }
}