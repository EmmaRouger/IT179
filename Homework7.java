import java.util.Random;
/** IT179 - Homework 7 main program
 
 Correct implementation of methods bubbleSort, insertionSort and mergeSort sould result in the following output:

 
 
 -------------------------
 Sorting an array of integers in increasing order
 -------------------
 1. Bubble Sort
 -------------------
 Unsorted array:
 A = [14, 18, 4, 6, 20, 7, 32, 10, 5, 26, 2, 9, 3]
 -----------
 Pass 1: A = [14, 4, 6, 18, 7, 20, 10, 5, 26, 2, 9, 3, 32]
 Pass 2: A = [4, 6, 14, 7, 18, 10, 5, 20, 2, 9, 3, 26, 32]
 Pass 3: A = [4, 6, 7, 14, 10, 5, 18, 2, 9, 3, 20, 26, 32]
 Pass 4: A = [4, 6, 7, 10, 5, 14, 2, 9, 3, 18, 20, 26, 32]
 Pass 5: A = [4, 6, 7, 5, 10, 2, 9, 3, 14, 18, 20, 26, 32]
 Pass 6: A = [4, 6, 5, 7, 2, 9, 3, 10, 14, 18, 20, 26, 32]
 Pass 7: A = [4, 5, 6, 2, 7, 3, 9, 10, 14, 18, 20, 26, 32]
 Pass 8: A = [4, 5, 2, 6, 3, 7, 9, 10, 14, 18, 20, 26, 32]
 Pass 9: A = [4, 2, 5, 3, 6, 7, 9, 10, 14, 18, 20, 26, 32]
 Pass 10: A = [2, 4, 3, 5, 6, 7, 9, 10, 14, 18, 20, 26, 32]
 Pass 11: A = [2, 3, 4, 5, 6, 7, 9, 10, 14, 18, 20, 26, 32]
 Sorted array with Bubble sort:
 A = [2, 3, 4, 5, 6, 7, 9, 10, 14, 18, 20, 26, 32]
 
 -------------------
 2. Insertion Sort
 -------------------
 Unsorted array:
 A = [14, 18, 4, 6, 20, 7, 32, 10, 5, 26, 2, 9, 3]
 -----------
 Pass 1: A = [14, 18, 4, 6, 20, 7, 32, 10, 5, 26, 2, 9, 3]
 Pass 2: A = [4, 14, 18, 6, 20, 7, 32, 10, 5, 26, 2, 9, 3]
 Pass 3: A = [4, 6, 14, 18, 20, 7, 32, 10, 5, 26, 2, 9, 3]
 Pass 4: A = [4, 6, 14, 18, 20, 7, 32, 10, 5, 26, 2, 9, 3]
 Pass 5: A = [4, 6, 7, 14, 18, 20, 32, 10, 5, 26, 2, 9, 3]
 Pass 6: A = [4, 6, 7, 14, 18, 20, 32, 10, 5, 26, 2, 9, 3]
 Pass 7: A = [4, 6, 7, 10, 14, 18, 20, 32, 5, 26, 2, 9, 3]
 Pass 8: A = [4, 5, 6, 7, 10, 14, 18, 20, 32, 26, 2, 9, 3]
 Pass 9: A = [4, 5, 6, 7, 10, 14, 18, 20, 26, 32, 2, 9, 3]
 Pass 10: A = [2, 4, 5, 6, 7, 10, 14, 18, 20, 26, 32, 9, 3]
 Pass 11: A = [2, 4, 5, 6, 7, 9, 10, 14, 18, 20, 26, 32, 3]
 Pass 12: A = [2, 3, 4, 5, 6, 7, 9, 10, 14, 18, 20, 26, 32]
 Sorted array with Insertion sort:
 A = [2, 3, 4, 5, 6, 7, 9, 10, 14, 18, 20, 26, 32]
 
 
 --------------------------
 3. Merge Sort
 --------------------------
 Unsorted array:
 A = [14, 18, 4, 6, 20, 7, 32, 10, 5, 26, 2, 9, 3]
 Sorted array with Merge sort:
 A = [2, 3, 4, 5, 6, 7, 9, 10, 14, 18, 20, 26, 32]
 
 
 ---------- Time Analysis of Sorting Algorithms----------------
 a) Unsorted random generated array of integers
 
 1. Bubble Sort: 4000 items  	  ? ms
 2. Insertion Sort: 4000 items    ? ms
 3. Merge Sort: 4000 items  	  ? ms
 
 b) Sorted array of integers (best case)
 1. Bubble Sort: 4000 items  	 ? ms
 2. Insertion Sort: 4000 items   ? ms
 3. Merge Sort: 4000 items  	 ? ms
 
 Note: Question marks represent the execution time for each of these sorting algorithms,
 when you compile and run this code it should show the actual time it took.
 */

public class Homework7{
    
    public static void main (String[] args){
        
        
        
        /**---------------------------
         Sorting an array of integers 
         */
        System.out.println("\n\n-------------------------");
        System.out.println("Sorting an array of integers in increasing order");
        System.out.println("-------------------");
        int [] A1 = {14,18,4,6,20,7,32,10,5,26,2,9,3};
        System.out.println("1. Bubble Sort");
        System.out.println("-------------------");
        System.out.println("Unsorted array:");
        printArray(A1);
        System.out.println("-----------");
        int[] bubble = Sort.bubbleSort(A1);
        System.out.println(" Sorted array with Bubble sort:");
        printArray(bubble);
        
        
        
        int [] A2 = {14,18,4,6,20,7,32,10,5,26,2,9,3};
        System.out.println("\n-------------------");
        System.out.println("2. Insertion Sort");
        System.out.println("-------------------");
        System.out.println("Unsorted array:");
        printArray(A2);
        System.out.println("-----------");
        int[] insert = Sort.insertionSort(A2);
        System.out.println(" Sorted array with Insertion sort:");
        printArray(insert);
        
        
        int [] A3 = {14,18,4,6,20,7,32,10,5,26,2,9,3};
        System.out.println("\n\n--------------------------");
        System.out.println("3. Merge Sort");
        System.out.println("--------------------------");
        System.out.println("Unsorted array:");
        printArray(A3);
        
        System.out.println("Sorted array with Merge sort:");
        int[] merge = Sort.mergeSort(A3);
        printArray(merge);
    
        
        /**-------------------------
         Timing sorting algorithms
         */
        System.out.println("\n\n---------- Time Analysis of Sorting Algorithms----------------");
        int N = 4000; // number of items in the array
        int [] array;
        long startTime, elapsedTime;
  
        System.out.println("a) Unsorted random generated array of integers\n");
        array = generateArray(N);
        startTime = System.currentTimeMillis();
        Sort.bubbleSort(array);
        elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("1. Bubble Sort: " + N + " items " + " \t " + elapsedTime + " ms");
  
        
        array = generateArray(N);
        startTime = System.currentTimeMillis();
        Sort.insertionSort(array);
        elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("2. Insertion Sort: " + N + " items " + " \t " + elapsedTime + " ms");
        
        array = generateArray(N);
        startTime = System.currentTimeMillis();
        Sort.mergeSort(array);
        elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("3. Merge Sort: " + N + " items " + " \t " + elapsedTime + " ms");
        
        
   
        // Time for sorting sorted array of integers (best case)
        System.out.println("\nb) Sorted array of integers (best case)");
        array = generateSortedArray(N);
        startTime = System.currentTimeMillis();
        Sort.bubbleSort(array);
        elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("1. Bubble Sort: " + N + " items " + " \t " + elapsedTime + " ms");
      
    
        
        array = generateSortedArray(N);
        startTime = System.currentTimeMillis();
        Sort.insertionSort(array);
        elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("2. Insertion Sort: " + N + " items " + " \t " + elapsedTime + " ms");
        
        
        
       array = generateSortedArray(N);
        startTime = System.currentTimeMillis();
        Sort.mergeSort(array);
        elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("3. Merge Sort: " + N + " items " + " \t " + elapsedTime + " ms");
        
    }
    
    
    /** Print array*/
    public static void printArray(int[] A){
        System.out.print("A = [");
        for(int j = 0; j<A.length-1; j++)
            System.out.print(A[j] + ", ");
        System.out.print(+A[A.length-1]+"]\n ");
    }
    
    
    /** Generates a random array of integers */
    public static int [] generateArray(int n){
        int [] a = new int [n];
        final int MAX_INT = 5000;
        Random rnd = new Random(2); // using seed=2
        
        for (int i = 0; i < n; i++) {
            a[i] = rnd.nextInt(MAX_INT);
        }
        return a;
    }
    
    /** Generates a sorted array of integers */
    public static int [] generateSortedArray(int n){
        int [] a = new int [n];
        
        for (int i = 0; i < n; i++) {
            a[i] = 2*i + 1;
        }
        return a;
    }
    

    
    
    
}
