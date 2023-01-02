public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("YORKIE");
        dog.eat();

        Parrot p = new Parrot("Parrot name");
        p.fly();
        p.eat();
        p.breathe();

        Penguin penguin = new Penguin("Dolly");
        penguin.fly();
    }
}