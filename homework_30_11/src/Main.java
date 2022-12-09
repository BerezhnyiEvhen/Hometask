import Buildings.Apartment;
import Buildings.Civil;
import Buildings.Industrial;
import Buildings.ServiceStation;

// создать из по примеру из жизни иерархию классов(предметную область на ваше усмотрение),
// демонстрирующих реализацию наследавания, полиморфизма и инкапсуляции данных
public class Main {
    public static void main(String[] args) {
        Civil civil = new Civil(1,true,20,true,true,"orange");
        civil.parkingNearBuilding();

        Industrial industrial = new Industrial(1,true,1500,true,true,"grey");
        industrial.parkingNearBuilding();
        civil.living();
        civil.protection();
        industrial.production();
        Apartment apartment = new Apartment(15,true,40,false,true,
                "blue", "monolith");
        apartment.living();
        apartment.protection();
        apartment.meal();
        System.out.println(apartment.getNumberOfStories());//инкапсуляция
        System.out.println(apartment.isUrban());//инкапсуляция
        System.out.println("");
        ServiceStation serviceStation=new ServiceStation(2,true,750.0,false,
                false,"white",12,false);
        serviceStation.production();
        serviceStation.repair();
        System.out.println(serviceStation.getNumberOfStories());//инкапсуляция
        System.out.println(serviceStation.isUrban());//инкапсуляция


    }

}
