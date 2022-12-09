package Buildings;

public class Mall extends Civil {
    boolean isThereCinema;

    public Mall(int numberOfStories, boolean isUrban, int numberOfApartments, boolean presenceOfShelter,
                boolean presenceOfElevator, String color, boolean isThereCinema) {
        super(numberOfStories, isUrban, numberOfApartments, presenceOfShelter, presenceOfElevator, color);
        this.isThereCinema=isThereCinema;
    }
    public void protection(){
        System.out.println("Malls protect us from cold, rain and heat.");
    }

    public void entertainment(){
        System.out.println("There are lots of places for entertainment");
    }
}
