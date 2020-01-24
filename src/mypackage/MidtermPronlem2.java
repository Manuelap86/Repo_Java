//package mypackage;
//
//import java.util.Arrays;
//
//public class MidtermProblem2 {
//    public static int[] removeElements(int[] arr, int key) {
//
//
////  Write a Java program to remove a specific element from an array.
////Original array: [32, 14, 24, 98, 24, 56, 148, 24, 78, 24]
////New Array: [32, 14, 98, 56, 148, 78]
//
//        int index = 0;
//        for (int i = 0; i < arr.length; i++)
//            if (arr[i] != key)
//                arr[index++] = arr[i];
//        return Arrays.copyOf(arr, index);
//
//        public static void main (String[])
//                {
//        int[] array = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
//        int key = 24;
//        array = removeElements(array, key);
//        System.out.println(Arrays.toString(array));
//
//
//
//    }
//    }
//}