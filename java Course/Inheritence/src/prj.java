class Vehicle1 {
    private String brand;
    private int speed;

    public Vehicle1(String brand, int speed){
        this.brand=brand;
        this.speed=speed;
    }
    public void showInfo(){
        System.out.println("Enter the brand: "+brand);
        System.out.println("Enter the speed: "+speed);
    }
}
class Car1 extends Vehicle1 {
    private int seats;

    public Car1(String brand, int speed, int seats){
        super(brand, speed);
        this.seats=seats;
    }
    public void showCarInfo(){
        showInfo();
        System.out.println("Enter the seats: "+seats);
    }
}
class ElectricCar1 extends Car1 {

    private int batteryCapacity;

    public ElectricCar1(String brand, int speed, int seats, int batteryCapacity){
        super(brand, speed, seats);
        this.batteryCapacity=batteryCapacity;
    }
    public void showElectricCarDetails(){
        showCarInfo();
        System.out.println("Enter the batteryCapacity: "+batteryCapacity);
    }

    void calculateRange(int batteryCapacity){
          batteryCapacity=batteryCapacity*5;

    }
}
public class prj{
    public static void main(String[] args) {
        ElectricCar1 car=new ElectricCar1("Tesla",200,4,80);
        System.out.println("Show All info of vehicles");
        car.showElectricCarDetails();

        System.out.println("Calculate the range: ");
        car.calculateRange(80);

    }
}