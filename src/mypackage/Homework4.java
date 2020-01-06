package mypackage;

import apple.laf.JRSUIConstants;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework4 {
    public static void main(String[] args) {

        //Homework:
        // 1. Menu
        // boolean isGuestOneVegan = true;
        // boolean isGuesttwoVegan = true;
        // both vegan? only offer up vegan dishes.
        //At least one vegan? make sure offer up some vegan options.
        //Else, offer anything on the menu

        boolean isGuestOneVegan = true;
        boolean isGuestTwoVegan = true;

        if(isGuestOneVegan && isGuestTwoVegan);
        System.out.println("Only Vegan Menu");
        if(isGuestOneVegan || isGuestTwoVegan);
        System.out.println("Offer Vegan Options");
        if(isGuestOneVegan != isGuestTwoVegan);
        System.out.println("Offer any menu");


        //2. Driver Controller
        // * I want to be able to put car on P mode, D mode, N mode, R mode
        // * If i am on P mode and parking type is parallel then i can park between two cars
        // * If i am on D mode I can put drive type to Snow type, Sport Type or Regular type
        // * If i am on N mode i can put car in car wash station
        // * If i am on R mode I can only reverse the car and car will activate back camera
        // * If mode is incorrect then print me invalid mode type, please check your car mode

        String[] modes = {"P","D","N","R"};
        char gear;

        if(modes.equals("P")){

        }
            System.out.println("I Can Parallel Park");
            if(modes.equals("D")) {
            }

                System.out.println("I can put to Snow,Sport or Regular Type");
                if(modes.equals("N")){

                }
                    System.out.println("Wash Station");
                    if(modes.equals("R")){

                    }
                        System.out.println("Reverse");





        // 3. Store a number in an int variable.
        // if the number is divisible by 15
        //  Display "Divisible by 15"
        //  Otherwise
        // Display the remainder you get when divide number by 15

        int number = 130;
        if(number%15==0) {
            System.out.println("Divisible by 15");
            System.out.println();
        } else
            System.out.println(number%15);


        // 4. Store your name in a variable.
        // if your name length comes out greater than 8
        // Display your name after replacing all 'a' to 'A' from your name.
        // Otherwise
        // Display your name in uppercase.


        String name = "Manuela";
        for (int i = 0; i > name.length()-1; i++) {
            if (name.length() > 8) {
                System.out.println(name.length());
            }
        }





        // -----------------------
        // 5. Create an array of 5 int values. Calculate the average of those 5 values. [pls don't use for-loop]
        // If you average of stored numbers greater than 25
        // Display Array from index 0 to last
        // Otherwise
        // Display Array from index last to 0

      int values[] = {5, 7, 2, 6, 9};
        int sum = 0;
        for(int i=0; i < values.length ; i++)
            sum = sum + values[i];
        int average = sum / values.length;
        System.out.println("Average value of the array elements is : " + average);

        if (number > 25) {
            System.out.println(Arrays.toString(values));
        }

        if (number < 25) {
            for (int i = values.length - 1; i >= 0; i--){
                System.out.println(Arrays.toString(values));
            }
        }





        // 6. Create a supermarket item finder
        // Take input from user and based on the input, you should display user which aisle has the item
        // For example: user enter milk, you program should say aisle 8. If the item is not found,
        // display a message saying "Out of stock "Please create program for below requirement
        // Milk = Aisle Eight
        //Eggs = Aisle Eight
        //French Fries = Aisle seven
        //Candy = Aisle Three
        //Frozen Pizza = Aisle seven
        //Donuts = Aisle Eight
        //Diapers = Aisle One
        //Apple = Aisle two
        // Orange = Aisle two
    }
}



