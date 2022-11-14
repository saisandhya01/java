public class Fish extends Animal{
    private int gills;
    private int eyes;
    private int finns;

    public Fish(int size, int weight, String name, int gills, int eyes, int finns) {
        super(1, 1, size, weight, name);
        this.gills = gills;
        this.eyes = eyes;
        this.finns = finns;
    }

    private void swim(int speed){
       moveMuscles();
       moveBackFin();
       super.move(speed);
    }
    public void move(int speed){
        swim(speed);
    }
    private void moveMuscles(){
        System.out.println("Fish.moveMuscles() called");
    }
    private void moveBackFin(){
        System.out.println("Fish.moveBackFin() called");
    }
}
