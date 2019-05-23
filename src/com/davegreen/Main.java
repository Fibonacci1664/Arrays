package com.davegreen;

import java.util.Scanner;

public class Main
{

    private static Scanner scanner = new Scanner(System.in);         // System.in allows data input from the user in the console window much like System.out prints out data.

    public static void main(String[] args)
    {
	    int[] myIntArray = new int[20];             // This would be the long way of creating an array, in that we
////	    myIntArray[0] = 45;                     // would declare how many items will be in the array, in this case 10,
////	    myIntArray[1] = 476;                    // we would then have to manually assign each element in the array a value.
////	    myIntArray[2] = 50;
//
//        System.out.println(myIntArray[1]);

        for(int i = 0; i < myIntArray.length; i ++)
        {
            myIntArray[i] = i * 10;
            System.out.println("Element " + i + ", value is " + myIntArray[i]);

        }
//        for(int i = 0; i < 20; i ++)
//        {
//            System.out.println("Element " + i + ", value is " + myIntArray[i]);
//        }
//
//
//
//	    double[] myDoubleArray = {1,2,3,4,5,6,7,8,9,10};    // Or we can do it the quick way, where we actually declare how many
//                              // {0,1,2,3,4,5,6,7,8,9 }     // elements the array will have and at the same time assign those elements
//                                                            // in the array a value, remembering that counting starts at zero.
//        System.out.println(myDoubleArray[5]);
//                                                            // I have written in the array element position below the values that have been assigned.
//                                                            // As you can see the number value 6 has been stored in array element 5 and so to
//                                                            // print out the value of 6 we would have call the array element 5 as can been seen in the example.
//
//        for(int i = 0; i < myDoubleArray.length; i ++)      // The other way we can initialize arrays is by using a for loop as can be seen above also
//        {                                                   // in this case we have created the array the quick was and in the above example we have done it
//            myDoubleArray[i] = i * 10;
//            System.out.println("Element " + i + ", value is " + myDoubleArray[i]);
//                                                            // the longer way, but the for loop uses them both in the same way, in the above example i have left the
//        }                                                   // termination condition to look like a standard termination condition, however for more efficient code
//                                                            // and so we wouldn't have to change code in multiple place we should really use the myDoubleArray.length property
//                                                            // this was the only values we would ever have to change would be the values that are originally declared when creating the array.
//
//
//        System.out.println("Print array called next");
//        printArray(myIntArray);
//
//                                                            // Here we have called a printArray() method with the int[] variable myIntArray passed
//                                                            // as its argument, as you can see in the actual methods parameter we have to make sure that
//                                                            // are declaring not only an array but ensuring that it is of the same data type, for example
//                                                            // we could not pass "double[] array" as the printArray methods parameter and then pass myIntArray as the
//                                                            // argument, as myIntArray has been declared as an int and not a double, likewise we could not pass back
//                                                            // myDoubleArray as the argument to the printArray() methods parameter as myDoubleArray has been declared
//                                                            // as a double[] and the method printArray has passed an int[] as its parameter.



//        int[] testArray = {1,2,3};
//
//        printArray(testArray);
//
//        int[] myIntegers = getIntegers(5);              // Here we are declaring an int[] array called myIntegers and then setting it to a method called getIntegers().
//                                                                // as you can see the getIntegers method has an argument of 5 as the parameter below is of int data type and is called number.
//        for(int i = 0; i < myIntegers.length; i ++)
//        {
//            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);          // This for loop takes the myIntegers variable i.e the getIntegers() method as its termination
//        }                                                                                       // condition, ultimately printing out the integers that the user has input along with a message.
//
//        System.out.println("The average is " + getAverage(myIntegers));
//
//    }
//
//    public static void printArray(int[] array)
//    {
//        for (int i = 0; i < array.length; i++)
//        {
//            System.out.println("Element " + i + ", value is " + array[i]);
//        }
//    }
//
//    public static int[] getIntegers(int number)                                                 // This is the getIntegers method that is the value of the variable myIntegers, this then
//    {                                                                                           // initially prompts the user to enter x integer values based on the argument that was passed when calling
//        System.out.println("Enter " + number + " integer values.\r");                           // the getIntegers method above when setting the myIntegers variable, this then declares a local variable of
//        int[] values = new int[number];                                                         // int[] array type called values and sets it to the parameter number.
//
//        for(int i = 0; i < values.length; i ++)                                                 // This for loop then cycles through the amount of times passed as the argument in the getIntegers()
//        {                                                                                       // waiting on a new value to be input each time until the termination condition is met which as stated above
//            values[i] = scanner.nextInt();                                                      // would be the number pass as the argument.
//        }
//
//
//        return values;                                                                          // This then returns back to where it was called and continues to run the next line of code.
//    }
//
//    public static double getAverage(int[] array)
//    {
//        int sum = 0;
//
//        for(int i = 0; i < array.length; i ++)              // This is the for loop which cycles through the array values that have been passed when
//        {                                                   // the getAverage() method was called in the sout above.
//            sum += array[i];                                // This takes the original local variable of sum and adds the array values each time totalling as it goes
//        }
//
//        return (double) sum / (double)array.length;         // This then casts the ints as doubles and then takes the sum of the now now fully cycled through for loop
//                                                            // and then divides that number by however many array values i.e. cycles of the for loop it had
//                                                            // It then returns that average value back to wherever the getAverage() method was called, which was
//                                                            // in the sout statement above, thereby printing out the average of the numbers that were input.
    }

}
