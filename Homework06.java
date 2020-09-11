
/**
 * Driving program
 *  Calls the recursive methods you
 *  have coded in the class Recursion
 * Homework 6
 */
public class Homework06 {
    
    public static void main(String[] args) {
        
        int target = 83;
        int[] arraySort = {2,6,8,10,20,24,32,43,50,56,80,83,91,97};
        double[] array = {2.2,4.5,3.1,8.6,10,5.2,9};
        int n = 5;
        String str = "Computer science is cool";
        System.out.println("\n1. Sum of squares first "+n+" integers is: " + Recursion.sumSquares(n));
        
        System.out.println("\n2. Reverse of string: " + str + ": " + Recursion.reverse(str));
        
        System.out.println("\n3. Sum of numbers array: " + Recursion.sumArray(array) );
        
        
        System.out.println("\n4. Power: 5^3 is " + Recursion.power(5,3)+", 2^-1 is " + Recursion.power(2,-1)  );
        
        System.out.println("\n5. Binary string 11001 in decimal: "+ Recursion.binaryToDecimal("11001"));

        int targetIndex = Recursion.binarySearch(arraySort, target, 0, arraySort.length-1);
        System.out.print("\n6. Searching for target " + target);
        if (targetIndex==-1){
            System.out.println("Target NOT found ");
        }else
        {
            System.out.println("Target found at index: "+targetIndex);
        }
        
        
        System.out.println("\n7. Tower of hanoi moves: ");
        System.out.println(Recursion.moveDisk(4,'A','C','B') + "\n");
        
        
        
        
    }
}
