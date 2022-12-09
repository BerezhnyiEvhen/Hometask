package Buildings;

public class Building {
    protected int numberOfStories;
    protected Boolean isUrban;

    public Building(int numberOfStories,boolean isUrban){
        this.numberOfStories = numberOfStories;
        this.isUrban= isUrban;
    }

    public void parkingNearBuilding(){
        System.out.println("There is a parking near the building");
    }
    public int getNumberOfStories(){
        return numberOfStories;
    }
    public boolean isUrban(){
        return isUrban;
    }
}
