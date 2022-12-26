import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        /*
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Canberra");
        placesToVisit.add("Perth");
        placesToVisit.add("New York City");
        placesToVisit.add("Toronto");
        placesToVisit.add("Chicago");

        placesToVisit.add(3, "Nashville");
        placesToVisit.remove(4);
        printList(placesToVisit);
        */

        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Toronto");
        addInOrder(placesToVisit, "Chicago");

        printList(placesToVisit);
        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> ll){
        //we are gonna use an iterator
        Iterator<String> i = ll.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting.." + i.next());
        }
        System.out.println("=================");

    }
    private static boolean addInOrder(LinkedList<String> ll, String newCity){
        ListIterator<String> stringListIterator = ll.listIterator();

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                //equal, do not add
                System.out.println(newCity + " already exists in linkedlist");
                return false;
            }
            if(comparison > 0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else{
               continue;
            }

        }
        stringListIterator.add(newCity);
        return true;
    }
    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        ListIterator<String> listIterator = cities.listIterator();
        if(cities.isEmpty()){
            System.out.println("No cities in the itinerary");
        }
        else{
            System.out.println("Now visiting.." + listIterator.next());
            printMenu();
        }

        while(!exit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday over");
                    exit = true;
                    break;
                case 1:
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting.." + listIterator.next());
                    }
                    else{
                        System.out.println("Reached the end of list..");
                    }
                    break;
                case 2:
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting.." + listIterator.previous());
                    }
                    else{
                        System.out.println("We are at the start of list");
                    }
                    break;
                case 3:
                    printMenu();
            }
        }
    }
    private static void printMenu(){
        System.out.println("Menu");
    }
}
