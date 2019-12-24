package mypackage;

public class Class1223{
    public static void main(String[] agrs){


/*
 In Java we use operators and Variables to create expression and with expression we can build logic algorithms
Java operators
1. Arithmetic
2. Assignment
3. Comparison
4. Logical
Arithmetic Operators
*/


        int x=45;
        int y=5;

        int add=x+y;
        int subtract=x-y;
        int multiply=x*y;
        int divide=x/y;

        int remainder=x%y;
        System.out.println(remainder);

        //Post Increment
       // int age=1;

        //Every birthday, add one to age
        //age++;
        //System.out.println(age);

        //Assignment Operators

        x=x+y;
        x+=y;
        System.out.println(x);

        //Comparison Operators ( Result of an expression in comparision operator is boolean)

        boolean isGrearer = x >= y;
        boolean isLess = x <=y;
        System.out.println(isLess);

        //Equality
        boolean isEqual = x == y;
        System.out.println(isEqual);
        boolean isNotEqual = x!= y;
        System.out.println(isNotEqual);

        //Ternery
        //If a person is older than 65, they are senior, otherwise considered an adult
        //int ageE = 45;
       // String status = ageE > 65 ? "senior" : "adult";
        //System.out.println(status);

        int age = 33;
        System.out.println(age);
        boolean isASenior = age >= 65;
        System.out.println(isASenior);
        boolean isAChild = age <= 7;
        System.out.println(isAChild);


        //Temperature Calculator

        double fahrenheit = 45;

        //Calculate celsius and store in celsius variable
        //T(C) = (68 F - 32) * 5/9 = 20C

        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println(celsius);

        //Calculate Kelvin value and store it in variable
        //T(K) = (60F + 459.67) * 5/9;

        double kelvin = (fahrenheit + 459.67) * 5/9;
        System.out.println(kelvin);









        }

}