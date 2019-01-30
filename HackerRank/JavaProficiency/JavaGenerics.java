package HackerRank.JavaProficiency;
/**
 * Practice / Java / Data Structures / Java HashSet
 * 19.01.20
 *
 */


import java.lang.reflect.Method;

class Printer
{
    //Write your code here
    protected <E> void  printArray(E array[]){
        for(E item: array){
            System.out.println(item);

        }
    }

}

public class JavaGenerics {
    //public class Solution {


    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }
}



