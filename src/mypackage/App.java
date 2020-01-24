package mypackage;

public class App {
    public static void main(String[] args){

        Restaurant restaurant = new Restaurant();
        restaurant.getRestaurantName();
        System.out.println();
        restaurant.printRestaurantSummary();
        System.out.println();
        restaurant.getGuestCapacity();
        restaurant.getRemovesParty();


    }
}
