package mypackage;

import java.sql.Time;

public class Mammal{

   int hands = 2;
   int legs = 2;
   String hair = "black";
   int wings = 0;

   public void isWalking(int legs) {
       if (legs >= 4)
           System.out.println("Walking");


   }

   public void sleep(int value){
       int time = 24;

       
       System.out.println("inside sleeping method");
   }

   public void drink(){

       System.out.println("inside drinking method");
   }

   public void eat(){
       System.out.println("Inside eating method");
   }

   public void changeHands (int otherHands){
       hands = otherHands;
   }

   public void changeLegs (int otherLegs){
       legs = otherLegs;
   }
   public void changeColor(String newColor) {
       hair = newColor;
   }
   public static void main (String [] args) {

       Mammal human = new Mammal();
       Mammal octopus = new Mammal();
       Mammal dog = new Mammal();

       human.hands = 2;
       human.legs = 2;
       human.wings = 0;
       human.hair = "black";
       System.out.println("Human has: " + human.legs + " "+ "legs"+" "  + human.hands +  " " + "hands"+ " " +human.wings+ " " + "wings" + " " + "and"+ " " +human.hair +" "+"hair");

       octopus.changeHands(8);
       octopus.changeLegs(0);
       octopus.wings = 0;
       octopus.changeColor("white");
       System.out.println("Octopus has: " + octopus.legs + " "+ "legs"+" "  + octopus.hands +  " " + "hands"+ " " +octopus.wings+ " " + "wings" + " " + "and"+ " " +octopus.hair +" "+"hair");


       dog.changeHands(0);
       dog.changeLegs(4);
       dog.wings = 0;
       dog.changeColor("brown");
       System.out.println("Dog has: " + dog.legs + " "+ "legs"+" "  + dog.hands +  " " + "hands"+ " " +dog.wings+ " " + "wings" + " " + "and"+ " " +dog.hair +" "+"hair");





   }
}
