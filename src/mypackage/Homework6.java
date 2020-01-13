package mypackage;

import java.sql.Array;

public class Homework6 {
    public static void main(String[] args) {

//        * Create methods to :
//*    1. Reverse a string
//        Eg: Input to method : Sample
//        Output/Return from method : elpmaS

        String name = "Sample";
        int stringLen = name.length();
        String reversed = "";
        for (int i = 0; i <=stringLen-1; i++) {
            reversed = reversed + name.charAt(stringLen - 1 - i);
        }
            System.out.println(reversed);


//       *    2. Reverse an array (fyi: length of input array can vary)
//*        Eg: Input to method : [25, 15, 3, 2, 40] or [20, 10, 44]
//*              Output/Return from method : [40, 2, 3, 15, 25] or [44, 10, 20]


        int [] arr = new int [] {25, 15, 3, 2, 40};
        for (int i = arr.length-1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }


//*    3. Add all numbers in a given array (fyi: length of input array can vary)
//*        Eg: Input to method : [20, 10, 40, 44]
//*              Output/Return from method : 114

        int [] array = new int[] {20,10,40,44};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);


//        4. *Sort an array
//*        Eg: Input to method : [20, 10, 40, 44]
//*              Output/Return from method : [10, 20, 40, 44]
        int [] arrayA = {20, 10,40,44};
        int temp;
        for (int i = 1; i < arrayA.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arrayA[j] < arrayA [j - 1]) {
                    temp = arrayA[j];
                    arrayA[j] = arrayA[j - 1];
                    arrayA[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }

//*    5. Find Average of a given array
//*        Eg: Input to method : [20, 10, 40, 44]
//*              Output/Return from method : 28.5

       double [] arrayB = {20,10,40,44};
        double total = 0;
        for(int i = 0; i < arrayB.length; i++){
            total = total + arrayB[i];
        }
        double average = total/arrayB.length;
        System.out.println(average);


//      6. Find maximum number in given array
//*        Eg: Input to method : [20, 10, 40, 44, 32]
//*              Output/Return from method : 44
     int [] number = new int[]{20,10,40,44,32};
     int max = number[0];
     for(int i = 0; i < number.length;i++) {
         if (number[i] > max)
         max = number[i];
     }

        System.out.println("Largest number is: " + max);

//  7. Find minimum number in given array
//*        Eg: Input to method : [20, 10, 40, 44]
//*              Output/Return from method : 10
        int [] minNum = {79, 90, 89, 65 };
        int min = minNum[0];
        for(int i = 0; i> minNum.length;i++){
            if (minNum[i]<min);
            min =minNum[i];
            }
        System.out.println("Minimum number is: " + min);

//      8. Create abbreviation for any string
//*        Eg: Input to method : Outfit of the day ( or Good morning or Happy new year)
//*              Output/Return from method : OOTD ( or GM or HMY)
        String newString = "Good Morning";
        String abbriviation = "";
        System.out.println(newString.toUpperCase().charAt(0));

//    9. Given two arrays, one contains total marks of 11 students of a class; second array contains their names in same order as marks-array.
        //*    Create a method which takes both array as parameters, and returns name of student who scored maximum marks in the class.
//*    For above example : method should return “Hannah”
        
        double[] sMarks = {90, 89, 91, 67, 87, 88, 93, 90, 100, 81, 54};
        String [] sNames = {"Happy", "Peace" , "Jesse", "Kaitlin" , "Amir", "Donald", "Steven", "Vicky", "Hannah" , "David", "Gia"};

//*
//*    11. Create a method to add numbers from 0 to given number, and return the result
//                *    Example : addUpto(5) -> method should return 15 (bcz, 0+1+2+3+4+5 = 15)
    }
}