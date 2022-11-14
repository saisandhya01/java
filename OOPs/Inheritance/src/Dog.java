public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }


    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        super.move(speed);
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        move(15);
    }
    public void run(){
        System.out.println("Dog.run() called");
        move(35);
    }

    private int teeth;
    private String coat;
    public Dog(int size, int weight, String name, int legs, int eyes, int tail, int teeth, String coat) {
        super(1, 1, size, weight, name);
        //call the constructor of parent class
        this.legs = legs;
        this.eyes = eyes;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
   private void chew(){
       System.out.println("Dog.chew() called");
   }
}
