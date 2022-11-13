public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Car porsche = new Car();
        Car holden = new Car();
        //porsche = null;
        //System.out.println("Model is " + porsche.getModel()); //outputs null

        //Getters and Setters
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}