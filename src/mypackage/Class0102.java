package mypackage;

public class Class0102 {
    public static void main(String[] args) {

        // LOOPS
        //Count up to 100
     //   int count = 0;
       // while (count <= 100) {
       //     System.out.println("Count: " + count);
         //   count++;
    //    }
        //count++ to add plus one ++ = count + 1
        // if we want to add more than one count + 2 or any other number
        //Count from 100 to 0

       // int count = 100;
      //  while ( count >= 0) {
        //    System.out.println( "Count: " + count);
          //  count--;
      //  }
        // Count form 0 to 100 only even numbers

       // int count = 0;
      //  while (count <= 100) {
        //    if (count % 2 == 0) {
         //       System.out.println("Count: " + count);
        //    }
          //  count++;
        //}
       // do {
        //    System.out.println("Count is: " + count);
         //   count++;
       // }while (count < 5);

        //Count up to 100
        //for (int i = 0; i <= 100; i++) {
           // System.out.println(i);
       // }
        // Count down from 100 to 0 by 5

        //for (int i = 100; i >= 0; i = i - 5){
          //  System.out.println(i);
    //}
        // Write logic that revers string

        //String name = "Manuela";
       // String reversedString = "";

        //char [] strArr = name.toCharArray();
        //System.out.println(strArr[4]);
       // for (int i = strArr.length - 1; i >= 0; i--) {
           // reversedString = reversedString + strArr[i];

     //   }
        //System.out.println(reversedString);

       // System.out.println(strArr[i]);

        //Write a logic that checks for palindrome

        String word = "racecar";
        String reversedString = "";

        char [] strArr = word.toCharArray();
        for (int i = strArr.length - 1; i >= 0; i--) {
            reversedString = reversedString + strArr[i];


        }

        System.out.println(reversedString);

        boolean isEqual = reversedString.equals(word);
        System.out.println(isEqual);

        }


}