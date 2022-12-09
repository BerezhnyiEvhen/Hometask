package Buildings;

public class Civil extends Building {
    protected int numberOfApartments;
    protected boolean presenceOfShelter;
    protected boolean presenceOfElevator;
    protected String color;

    public Civil(int numberOfStories,boolean isUrban,int numberOfApartments,
                 boolean presenceOfShelter,boolean presenceOfElevator,String color){
        super(numberOfStories,isUrban);
        this.numberOfApartments = numberOfApartments;
        this.presenceOfShelter = presenceOfShelter;
        this.presenceOfElevator = presenceOfElevator;
        this.color = color;
    }

    public void living(){
        System.out.println("Civil building is used for rest after workday.");
    }

    public void protection(){
        System.out.println("It protect us from cold, rain and heat.");
    }

    @Override
    public void parkingNearBuilding() {
        System.out.println("There is an underground-parking here.");
    }
}
