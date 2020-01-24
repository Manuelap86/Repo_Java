package mypackage;

import apple.laf.JRSUIConstants;

public class Restaurant {

//
//    /**
//     * Create a restaurant class with attribute name, guestCapacity, guestCount
//     * 1. Create a method that tells user if the seats are available
//     * 2. Create a method that seatsParty
//     * 3. Create a method that removesParty
//     * 4. Create a method that allows host open for services by passing restaurant name/guestCapacity
//     * 5. Create a method that printsRestaurantSummary
//     */

    private String restaurantName;
    private int guestCapacity;
    private int guestCount;
    private boolean seatParty;
    private int removesParty;
    public void printRestaurantSummary(){
        System.out.println("Name: " + restaurantName);
        System.out.println("Capacity: " + getGuestCapacity());
        System.out.println("Seats available: " + seatParty);
        System.out.println("People left:" + removesParty);
    }

    public String setRestaurantName(){
        return restaurantName;
    }
    public String getRestaurantName() {
        return restaurantName;
    }


    public int getGuestCapacity() {

        return guestCapacity - guestCount;
    }
    public boolean isSeatParty() {
        if (guestCount < guestCapacity) {
            System.out.println("seat party");
        } else {
            System.out.println("wait");
        }
        return seatParty;
    }
    public int getRemovesParty(){
        return (guestCount - removesParty);

    }

}
