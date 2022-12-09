package Buildings;

public class ServiceStation extends Industrial {
    protected int numberOfSpots;//количество мест для обслуживания автомобилей
    protected boolean isEcofriendly;
    public ServiceStation(int numberOfStories, boolean isUrban, double square, boolean presenceOfShelter,
                          boolean presenceOfElevator, String color,int numberOfSpots,boolean isEcofriendly) {
        super(numberOfStories, isUrban, square, presenceOfShelter, presenceOfElevator, color);
        this.numberOfSpots= numberOfSpots;
        this.isEcofriendly=isEcofriendly;
    }
    public void production(){
        System.out.println("There are no goods produced at ServiceStation.");
    }
    public void repair(){
        System.out.println("It could be repairing more than 10 car at once.");
    }
}
