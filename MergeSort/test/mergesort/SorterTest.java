/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;
import static org.junit.Assert.*;
import org.junit.*;

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
        assertEquals(5, sorter.getInversions());
    }
    
    
    @Test
    public void testMergeSort_rh1() {
        System.out.println("testMergeSort_rh1");
        int[] unsorted = {1,2,3,4,5,7,6};
        int[] sorted = {1,2,3,4,5,6,7};
        assertArrayEquals(sorted, sorter.mergeSort(unsorted));
        assertEquals(1, sorter.getInversions());
    }    
    
    @Test
    public void testMergeSort_lh1() {
        System.out.println("testMergeSort_rh1");
        int[] unsorted = {2,1,3,4,5,6,7};
        int[] sorted = {1,2,3,4,5,6,7};
        assertArrayEquals(sorted, sorter.mergeSort(unsorted));
        assertEquals(1, sorter.getInversions());
    }        

    @Test
    public void testMergeSort_none() {
        System.out.println("testMergeSort_none");
        int[] sorted = {1,2,3,4,5,6,7};
        assertArrayEquals(sorted, sorter.mergeSort(sorted));
        assertEquals(0, sorter.getInversions());
    }        
    

    @Test
    public void testMergeSort_reversed() {
        System.out.println("testMergeSort_reversed");
        int[] unsorted = {7,6,5,4,3,2,1};
        int[] sorted = {1,2,3,4,5,6,7};
        assertArrayEquals(sorted, sorter.mergeSort(unsorted));
        assertEquals(21, sorter.getInversions());
    }        
    
}
