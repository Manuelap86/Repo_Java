package mypackage;

import java.util.Scanner;

public class Class0106 {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element :" + numbers[i]);
        }
        for (int number : numbers) {
            System.out.println(number);
        }

        String[] names = {"James", "Larry", "Tom", "Lacy"};

        for (String name : names) {
            System.out.println(name);
            boolean isJames = name.equalsIgnoreCase("james");
            if (isJames == true) {
                System.out.println("James is here");
                break;
            }
        }

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (String month : months) {
            //System.out.println(month);
            boolean isMonth = month.equals("December");
            if (isMonth == true) {
                System.out.println("December is here");
                break;
            }
        }

        //instance of scanner
        Scanner scan = new Scanner(System.in);
        //Tell User to enter the password
        System.out.println("Please enter the password");
        //takes input from console and storing the value into actualPassword variable
        String actualPassword = scan.nextLine();
        //setting expecting password which is associated with user account details in database
        String expectedPassword = "Technosoft";
        //Creating for loop that gives user max amount of tries (10 times)
        for (int i = 0; i < 10; i++) {
            //checking if actual password is not equal to expected
            if (!actualPassword.equals(expectedPassword)) {
                //subtracting the count by interation so user will have less tries -1 every time
                int count = 10 - i;

                // console message to user to enter valid passoword
                System.out.println("Please enter valid password");


                // console message to let user know how many more tries he has left with
                System.out.println("You have " + count + "more tries");

                // letting user to update actualPassword value with new input
                actualPassword = scan.nextLine();

                //if count equals to 9, then notify user with custom message
                if (i == 9) {
                } else {
                    //if at any point in the loop user enters correct pass
                    System.out.println("Welcome to home page");
                    break;
                }
            }


        }
    }
}