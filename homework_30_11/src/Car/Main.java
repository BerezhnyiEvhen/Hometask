package Car;

public class Main {
    public static void main(String[] args) {
        Car car =new Car(180.0,70,2016,15000,"Volkswagen",0.0,true);
        car.getCarInformation();
        System.out.println(" ");
        car.carSound();
        car.carSwitchOff();
        System.out.println(" ");
        car.carSwitchOn();
        System.out.println(" ");
        car.breakPedal();
        System.out.println(" ");
        car.acceleratorPedal();
        System.out.println(" ");
    }
}
