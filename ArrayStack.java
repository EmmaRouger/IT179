import java.util.NoSuchElementException;

/** Implementation of the interface StackInterface using an array as internal data structure.
 HW5
 */
public class ArrayStack<E> implements StackInterface<E> {

    // Data Fields
    E[] theData; // create an array for the stack
    int top = -1; // Index to top of stack, initially empty stack.
    private static final int INITIAL_CAPACITY = 10;

    /**
     * Construct an empty stack with the default
     * initial capacity.
     */
    public ArrayStack() {
        theData = (E[]) new Object[INITIAL_CAPACITY];
    }

    //---Methods - Write method specified in the StackInterface  here----//
    
   
    
    
    
    
    //------------------------------------------//
    /**
     * Method to reallocate the array containing the stack data
     * @post The size of the data array has been doubled
     *       and all of the data has been copied to the new array
     */
    private void reallocate() {
        E[] temp = (E[]) new Object[2 * theData.length];
        System.arraycopy(theData, 0, temp, 0, theData.length);
        theData = temp;
    }
    
}

