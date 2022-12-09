package Laptop;

////Написать класс Laptop, с полями brand, isTurnedOn, welcomePhrase, butteryAmount. инициализировать поля конструктором,
////    создать методы получения значений, вывода приветствия при загрузке, метод уменьшения заряда батареи, если батареи осталось < 10%
////    вывести предупреждение на екран, если 0, выкл комп и вывести сообщение на екран.
public class Laptop {
    String brand;
    boolean isTurnedOn;
    String welcomePhrase;
    double batteryAmount;//емкость в mAh
    int currentCharge;//заряд батареи сейчас, %

    public Laptop(String brand,boolean isTurnedOn, String welcomePhrase, double batteryAmount, int currentCharge){
        this.brand=brand;
        this.isTurnedOn=isTurnedOn;
        this.welcomePhrase=welcomePhrase;
        this.batteryAmount=batteryAmount;
        this.currentCharge=currentCharge;
    }

    public void LaptopInfo(){
        System.out.println("The laptop`s brand is "+brand+".");
        System.out.println("The laptop`s batteryAmount is "+batteryAmount+" mAh.");

    }

    public void getWelcomePhrase(){
        System.out.println("Welcome to Windows!");
    }
    public void reduceCharge(){
        if(currentCharge>10 && currentCharge<100){
            currentCharge-=5;
            System.out.println("The charge level is "+currentCharge+" %");
        }else if (currentCharge<10 && currentCharge>0){
            System.out.println("Low battery! It needs to be charged.");
        }else{
            System.out.println("The laptop is turned off.");
        }
    }
}
