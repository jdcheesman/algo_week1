/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author j.cheesman
 */
public class InversionCounterTest {
    
    private InversionCounter ic;
    
    public InversionCounterTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        ic = new InversionCounter();
    }
    
    @After
    public void tearDown() {
        ic = null;
    }

    @Test
    public void testCountInversions() {
        int[] data = {1,3,5,2,4,6};
        int expectedResult = 3;
        assertEquals(expectedResult, ic.countInversions(data));
    }

    @Test
    public void testCountInversions_rh1() {
        int[] data = {1,2,3,4,6,5};
        int expectedResult = 1;
        assertEquals(expectedResult, ic.countInversions(data));
    }
    
    @Test
    public void testCountInversions_lh1() {
        int[] data = {2,1,3,4,5,6};
        int expectedResult = 1;
        assertEquals(expectedResult, ic.countInversions(data));
    }
    
    @Test
    public void testCountInversions_rh2() {
        int[] data = {1,2,3,5,6,4};
        int expectedResult = 2;
        assertEquals(expectedResult, ic.countInversions(data));
    }    

    @Test
    public void testCountInversionsNone() {
        int[] data = {1,2,3,4,5,6};
        int expectedResult = 0;
        assertEquals(expectedResult, ic.countInversions(data));
    }
    
    @Test
    public void testCountInversionsAll() {
        int[] data = {6,5,4,3,2,1};
        int expectedResult = 15;
        assertEquals(expectedResult, ic.countInversions(data));
    }   
    
    @Test
    public void testCountInversionsAll2() {
        int[] data = {4,3,2,1};
        int expectedResult = 6;
        assertEquals(expectedResult, ic.countInversions(data));
    }    

}
