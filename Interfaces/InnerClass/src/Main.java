import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button button = new Button("Print");
    public static void main(String[] args) {
        //4 types of inner classes
        //1. static nested class, 2. non-static nested class, 3. local class, 4. anonymous class

        //Local classes are declared inside a block (in if statement). Scope is restricted to block
        //Local classes are not commonly used

        //Local class example
        class ClickListener implements Button.OnClickListener {
            public ClickListener(){
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }
        //button.setOnClickListener(new ClickListener());

        //Anonymous class
        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });

        //inner nested class Gear
        /*GearBox mcLaren = new GearBox(6);
        //GearBox.Gear first= mcLaren.new Gear(1, 12.3);
        //System.out.println(first.driveSpeed(1000));

        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(2500));*/

    }
}