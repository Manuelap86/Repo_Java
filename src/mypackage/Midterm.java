package mypackage;

public class Midterm {
    public static void main(String[] args) {
//        1.
//        Create a method to return missing smallest positive integer (greater than 0) from given array.
//                Example:
//        For array : [1,3,5,4,2,7]
//        Method should return : 6
//        For array : [-1, -3, 4, 2]
//        Method should return : 1
//        For array : [0, 5, -1, 1, 2, 4, 5, 3, 7, 1, 2]
//        Method should return : 6
        int arr[] = {1, 3, 5, 4, 2, 7};
        int arr1[] = {-1, -3, 4, 2};
        int arr2[] = {0, 5, -1, 1, 2, 4, 5, 3, 7, 1, 2};
        int n = arr.length + 1;
        int n1 = arr1.length + 1;
        int n2 = arr2.length + 1;
        int sumOfNNumbers = sumOfAllNNumbers(n);
        int sumOfInputArray = sumOfInputArrayNumbers(arr);
        int missingNumber = sumOfNNumbers - sumOfInputArray;


        System.out.println("Missing number is : " + missingNumber);

    }

    public static int sumOfAllNNumbers(int n) {
        int sum = (n * (n + 1)) / 2;
        return sum;
    }

    public static int sumOfInputArrayNumbers(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum = sum + input[i];
        }
        return sum;

    }

}

































