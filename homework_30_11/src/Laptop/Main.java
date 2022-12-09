package Laptop;


public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Lenovo",true,"Welcome to Windows!", 25000.0,82);
        laptop.LaptopInfo();
        System.out.println(" ");
        laptop.getWelcomePhrase();
        laptop.reduceCharge();

    }
}
