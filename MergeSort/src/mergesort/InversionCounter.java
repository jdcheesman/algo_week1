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
    
    private Sorter sorter = new Sorter();
    
    public long countInversions(int[] data) {
        sorter.mergeSort(data);
        return sorter.getInversions();
    }
    

}

