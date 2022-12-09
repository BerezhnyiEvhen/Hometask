package Car;
/*Создать класс Car c параметрами maxSpeed, fuelAmount, productionYear, price, brand, currentSpeed, isEngineStarted
        В котором должен быть конструктор инициализирующий параметры заданные заводом изготовителем, а так же методы получения
        этих значений. Создать метод который заводит машину, глушит машину. Создать метод имитации педали газ/тормоз,
        каждое нажатие добавляет/уменьшает текущую скорость на 10км/ч. Создать метод имитации звукового сигнала(вывод в консоль)*/
public class Car {
    double maxSpeed;
    double fuelAmount;
    int productionYear;
    double price;
    String brand;
    double currentSpeed;
    boolean isEngineStarted;

    public Car(double maxSpeed, double fuelAmount, int productionYear, double price, String brand, double currentSpeed, boolean isEngineStarted) {
        this.maxSpeed = maxSpeed;
        this.fuelAmount = fuelAmount;
        this.productionYear = productionYear;
        this.price = price;
        this.brand = brand;
        this.currentSpeed = currentSpeed;
        this.isEngineStarted = isEngineStarted;
    }

    public void getCarInformation() {
        System.out.println("The maximal speed is " + maxSpeed + " miles/h.");
        System.out.println("The volume of fuel tank is " + fuelAmount + "gallons.");
        System.out.println("The car produced in " + productionYear);
        System.out.println("The car`s price is: " + price + " $.");
        System.out.println("The brand of the car is " + brand);
        System.out.println("The car is " + SwitchCar(isEngineStarted) + " now.");
        System.out.println("Current speed is " + currentSpeed + " miles/h" + " now.");
    }

    public boolean getSwitchCar() {
        return isEngineStarted;
    }

    public String SwitchCar(boolean isEngineStarted) {
        if (isEngineStarted) {
            return "running";
        } else {
            return "switched off";
        }
    }

    public void carSound() {
        System.out.println("The car honks.");
    }

    public void carSwitchOn() {
        if (isEngineStarted) {
            System.out.println("The car is running.");
        }
    }

    public void carSwitchOff() {
        if (isEngineStarted == false) {
            System.out.println("The car is switched off.");
        }
    }

    public void breakPedal() {
        if (currentSpeed < maxSpeed) {
            currentSpeed -= 10;
            System.out.println("The current speed is " + currentSpeed + " miles/h");
        } else if (currentSpeed < 10) {
            System.out.println("The car stopped.");
        }
    }
    public void acceleratorPedal() {
        if (currentSpeed>=0 || currentSpeed < maxSpeed) {
            currentSpeed += 10;
            System.out.println("The current speed is " + currentSpeed + " miles/h");
        } else {
            System.out.println("TIt is the maximal speed.");
        }
    }
}
