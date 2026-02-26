import model.BodyType;
import model.Car;

public class Main {
    public static void main(String[] args) {
         Car car1 = new Car("Toyota", "Camry", BodyType.SEDAN, 2020, 30000);
        System.out.println(car1.getMake());
 
 
    // Uncomment the following line to test invalid input for setMake method
    car1.setMake("Peugeot");
    System.out.println(car1.getMake());
 
 
    // Uncomment the following line to test invalid input for setModel method
    car1.setModel("2008");
    System.out.println(car1.getModel());
 
 
    // Uncomment the following line to test invalid input for setBodyType method
    car1.setBodyType(BodyType.SUV);
    System.out.println(car1.getBodyType());
 
 
    // Uncomment the following line to test invalid input for setProductionYear method
    car1.setProductionYear(2002);
    System.out.println(car1.getProductionYear());
 
 
    // Uncomment the following line to test invalid input for setPrice method
    car1.setPrice(1);
    System.out.println(car1.getPrice());
 
 
    // Uncomment the following line to test invalid input for setPrice method
    car1.setPrice(20000);
    System.out.println(car1.getPrice());

 
 
    // Uncomment the following line to test invalid input for the constructor
    Car car2 = new Car("Toyota", "Camry", BodyType.SEDAN, 2020, 30000);
    }
}