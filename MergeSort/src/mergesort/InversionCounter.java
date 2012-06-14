/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

/**
 *
 * @author j.cheesman
 */
public class InversionCounter {
    
    public int countInversions(int[] data) {
        int pivot = data.length / 2;
        int[] arr1 = new int[pivot];
        System.arraycopy(data, 0, arr1, 0, arr1.length);

        int[] arr2 = new int[data.length-pivot];
        System.arraycopy(data, pivot, arr2, 0, arr2.length);

        
        return count(arr1, arr2);
    }
    
    public int count(int[] arr1, int[] arr2) {
        int count = 0;
        int i=0;
        int j=0;
        for (int k=0; k<arr1.length + arr2.length; k++) {
            // edge cases:
            if (i >= arr1.length) {
                // we've used up all the left hand array (arr1), so
                // pivot the right hand array (arr2)
                if (arr2.length > 1) {
                    int[] newArr = new int[arr2.length-j];
                    System.arraycopy(arr2, j, newArr, 0, newArr.length);
                    count+=countInversions(newArr);
                    j++;
                }
            }
            else if (j >= arr2.length) {
                // use all left
                if (arr1.length > 1) {
                    int[] newArr = new int[arr1.length-i];
                    System.arraycopy(arr1, i, newArr, 0, newArr.length);
                    count+=countInversions(newArr);
                }
            }
            else if (arr1[i] < arr2[j]) {
                i++;
            }
            else {
                count+=(arr1.length-i);
                j++;
            }
        }
        return count;
    }    

}

