public class Animal {
    private int brain;
    private int body;
    private int size;
    private int weight;
    private String name;

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }
    public void eat(){
        System.out.println("eat method is called");
    }
    public void move(int speed){
        System.out.println("Animal moves with speed " + speed);
    }
    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public Animal(int brain, int body, int size, int weight, String name) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.name = name;
    }
}
