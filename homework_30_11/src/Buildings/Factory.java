package Buildings;

public class Factory extends Industrial {
    protected int numberOfStorage;
    protected boolean isEcofriendly;

    public Factory(int numberOfStories, boolean isUrban, double square, boolean presenceOfShelter,
                   boolean presenceOfElevator, String color,int numberOfStorage,boolean isEcofriendly) {
        super(numberOfStories, isUrban, square, presenceOfShelter, presenceOfElevator, color);
        this.numberOfStorage= numberOfStorage;
        this.isEcofriendly=isEcofriendly;
    }
    public void production(){
        System.out.println("Factory is used for production of goods.");
    }
    public void productionOfMedicine(){
        System.out.println("This factory produces medicines. ");
    }
    @Override
    public void parkingNearBuilding() {
        System.out.println("There is a small parking for company`s cars near.");
    }
}
