/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author j.cheesman
 */
public class SorterTest {
    
    private Sorter sorter;
    
    public SorterTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        sorter = new Sorter();
    }
    
    @After
    public void tearDown() {
        sorter = null;
    }

    @Test
    public void testSort() {
        int[] unsorted = {3,2,1};
        int[] sorted = {1,2,3};
        assertArrayEquals(sorted, sorter.sort(unsorted));
    }
    
    @Test
    public void testMerge() {
        System.out.println("testMerge");
        int[] arr1 = {1, 5, 9};
        int[] arr2 = {2, 4, 8, 10};
        int[] merged = {1,2,4,5,8,9,10};
        assertArrayEquals(merged, sorter.merge(arr1, arr2));
    }
    
    @Test
    public void testMergeSort() {
        System.out.println("testMergeSort");
        int[] unsorted = {3,2,1,4,6,7,5};
        int[] sorted = {1,2,3,4,5,6,7};
        assertArrayEquals(sorted, sorter.mergeSort(unsorted));
    }
    
}
