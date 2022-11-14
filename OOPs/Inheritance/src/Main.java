public class Main {
    public static void main(String[] args) {
         Animal a = new Animal(1, 1, 25, 60, "animal");
         Dog shephard = new Dog(25, 25, "febby", 4, 2, 1, 23, "fur");
         shephard.eat();
         shephard.walk();
         shephard.run();
         Fish f = new Fish(1, 11, "Nemo", 2, 2, 2);
         f.move(23);
    }
}