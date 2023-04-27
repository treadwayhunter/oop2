package parallelsort;

import java.util.Arrays;
import java.util.concurrent.RecursiveAction;

/**
 * This class represents the work that is done to sort the array
 * @param <E> the type of the element that will be sorted
 */
class ParallelMergeTask<E extends Comparable<? super E>> extends RecursiveAction {
    /**
     * THRESHOLD is the max number of elements before using Arrays native sort.
     * In case anyone decides to through a massive array at this program by editing main
     */
    private static final int THRESHOLD = 500000;

    private final E[] a;
    private final int start;
    private final int end;

    /**
     * The constructor for ParallelMergeTask, assigns values to final variables
     * @param a the array that will be sorted
     * @param start beginning index of the portion to be sorted
     * @param end last index of portion to be sorted
     */
    ParallelMergeTask(E[] a, int start, int end) {
        this.a = a;
        this.start = start;
        this.end = end;
    }

    /**
     * Function does an initial check, if the length of the portion to be sorted is less than THRESHOLD then we use
     * arrays sorting method, else we fork the tasks and join them.
     *
     */
    @Override
    protected void compute() {
		
        // your code here 
		
		
    }

    /**
     *  Merges two adjacent subranges of an array
     *
     * @param lo beginning index of the portion to be sorted
     * @param middle middle index between the two portions to be sorted
     * @param hi last index of portion to be sorted
     */
    private void merge( int lo, int middle, int hi ) {
        
		
	// your code here 
	
    }
}
