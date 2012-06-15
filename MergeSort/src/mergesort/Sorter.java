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
    
    private long inversions = 0;

    public int[] mergeSort(int[] toSort) {
        if (toSort.length <= 1) {
            return toSort;
        }
        int pivot = toSort.length / 2;
        int[] left = new int[pivot];
        System.arraycopy(toSort, 0, left, 0, left.length);
        left = mergeSort(left);

        int[] right = new int[toSort.length-pivot];
        System.arraycopy(toSort, pivot, right, 0, right.length);
        right = mergeSort(right);
        
        return merge(left, right);
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
            if (j==arr2.length || (i<arr1.length && arr1[i] < arr2[j])) {
                result[k] = arr1[i];
                i++;
            }
            else {
                result[k] = arr2[j];
                j++;
                if (i != arr1.length) {
                    inversions+=(arr1.length-i);
                }
            }
        }
        return result;
    }
    
    public long getInversions() {
        return inversions;
    }
}
