package mypackage;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {

        String myStatement = "I am a programmer";
        System.out.println(myStatement);

       // String extractedString = myStatement.substring(12, 22);
        //System.out.println("Extracted Word:" + extractedString);

        String [] words = myStatement.split("programmer", 4);
        System.out.println("programmer");

        String [] wordsS = myStatement.split("");
        System.out.println("Number of words: " + wordsS.length);


        int countWords = myStatement.split("\\w+").length ;
        System.out.println(countWords);

        String myStatementNew = myStatement.replace('r','f');
        System.out.println(myStatementNew);

        String myName = "Manuela";
        System.out.println(myName);
        int count = 0;
        for(char c: myName.toCharArray()){count++;}

       // int countLetters = myName.length();
        //System.out.println(countLetters);

        String[] names = new String[8];
        names[0] = "Mohammad";
        names[1] = "John";
        names[2] = "Ferdous";
        names[3] = "Abul";
        names[4] = "Ratna";
        names[5] = "Mareeha";
        names[6] = "Ruslan";
        names[7] = "Himani";

        int size = names.length;
        System.out.println("The Arrey Lenght is:" + size);

        boolean isEqual = names[1].equals("John");
        System.out.println(isEqual);

        String[] arrayFriends = new String[]{"Vika", "Olya", "Mila", "Ronni", "Yulya"};
        System.out.println(arrayFriends.length);
        System.out.println(arrayFriends[2]);
        System.out.println(Arrays.toString(arrayFriends));
        System.out.println(arrayFriends[2].startsWith("A"));





        //String[] friends = new String[5];
        //friends[0] = "Vika";
       // friends[1] = "Olya";
        //friends[2] = "Mila";
       // friends[3] = "Ronni";
       // friends[4] = "Yulya";
       // int quantity = friends.length;
//        System.out.println(friends[2]);









    }
}