package Buildings;

public class Apartment extends Civil {
    String constructionType;


    public Apartment(int numberOfStories, boolean isUrban, int numberOfApartments,
                     boolean presenceOfShelter, boolean presenceOfElevator, String color, String constructionType) {
        super(numberOfStories, isUrban, numberOfApartments, presenceOfShelter, presenceOfElevator, color);
        this.constructionType= constructionType;
    }
    public void living(){
        System.out.println("Apartment buildings is used for rest after workday.");
    }

    public void protection(){
        System.out.println("Apartment buildings protect us from cold, rain and heat.");
    }

    public void meal(){
        System.out.println("There you can cook some food and take a meal.");
    }
}
