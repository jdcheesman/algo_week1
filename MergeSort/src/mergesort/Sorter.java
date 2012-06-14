/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

/**
 *
 * @author j.cheesman
 */
public class Sorter {
    
    public int[] mergeSort(int[] toSort) {
        int pivot = toSort.length / 2;
        int[] arr1 = new int[pivot];
        System.arraycopy(toSort, 0, arr1, 0, arr1.length);

        int[] arr2 = new int[toSort.length-pivot];
        System.arraycopy(toSort, pivot, arr2, 0, arr2.length);
        
        return merge(sort(arr1), sort(arr2));
    }
    
    public int[] sort(int[] toSort) {
        for (int i=1; i<toSort.length; i++) {
            if (toSort[i-1] > toSort[i]) {
                int a = toSort[i-1];
                int b = toSort[i];
                toSort[i-1] = b;
                toSort[i] = a;
                return sort(toSort);
            }
        }
        return toSort;
    }
    
    /**
     * Naive merge, assumes arrays have all different members, ignores
     * various end cases.
     */
    public int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i=0;
        int j=0;
        for (int k=0; k<result.length; k++) {
            if (i<arr1.length && arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            }
            else {
                result[k] = arr2[j];
                j++;
            }
        }
        return result;
    }
    
}
