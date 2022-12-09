package Buildings;

public class Industrial extends Building{
    double square;
    boolean presenceOfShelter;
    boolean presenceOfElevator;
    String color;

    public Industrial(int numberOfStories, boolean isUrban, double square,
                      boolean presenceOfShelter,boolean presenceOfElevator,String color) {
        super(numberOfStories, isUrban);
        this.square=square;
        this.presenceOfShelter = presenceOfShelter;
        this.presenceOfElevator = presenceOfElevator;
        this.color = color;
    }
    public void production(){
        System.out.println("Industrial buildings is used for production of goods and life support .");
    }

    @Override
    public void parkingNearBuilding() {
        System.out.println("There is a large parking here");
    }
}
