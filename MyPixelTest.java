package org.cis120;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Use this file to test your implementation of Pixel.
 * 
 * We will manually grade this file to give you feedback
 * about the completeness of your test cases.
 */

public class MyPixelTest {

    /*
     * Remember, UNIT tests should ideally have one point of failure. Below we
     * give you two examples of unit tests for the Pixel constructor, one that
     * takes in three ints as arguments and one that takes in an array. We use
     * the getRed(), getGreen(), and getBlue() methods to check that the values
     * were set correctly. These two tests do not comprehensively test all of
     * Pixel so you must add your own.
     * 
     * You might want to look into assertEquals, assertTrue, assertFalse, and
     * assertArrayEquals at the following:
     * http://junit.sourceforge.net/javadoc/org/junit/Assert.html
     *
     * Note, if you want to add global variables so that you can reuse Pixels
     * in multiple tests, feel free to do so.
     */

    @Test
    public void testConstructInBounds() {
        Pixel p = new Pixel(40, 50, 60);
        assertEquals(40, p.getRed());
        assertEquals(50, p.getGreen());
        assertEquals(60, p.getBlue());
    }

    @Test
    public void testConstructArrayLongerThan3() {
        int[] arr = { 10, 20, 30, 40 };
        Pixel p = new Pixel(arr);
        assertEquals(10, p.getRed());
        assertEquals(20, p.getGreen());
        assertEquals(30, p.getBlue());
    }

    /* ADD YOUR OWN TESTS BELOW */

    // equals, toString, distance, getComponents test
    @Test
    public void testEquals() {
        int[] arr1 = { 10, 20, 30, 40 };
        Pixel p1 = new Pixel(arr1);
        int[] arr2 = { 10, 20, 30, 40 };
        Pixel p2 = new Pixel(arr2);
        arr2[0] = 145;
        Pixel p3 = new Pixel(arr2);

        // equals test
        assertTrue(p1.equals(p2));
        assertFalse(p1.equals(p3));

    }

    @Test
    public void testToString() {
        int[] arr1 = { 10, 20, 30, 40 };
        Pixel p1 = new Pixel(arr1);
        int[] arr2 = { 10, 20, 30, 40 };
        Pixel p2 = new Pixel(arr2);
        arr2[0] = 145;
        Pixel p3 = new Pixel(arr2);

        // toString test
        assertEquals("(10, 20, 30)", p1.toString());
        assertEquals("(10, 20, 30)", p2.toString());
        assertEquals(p2.toString(), p1.toString());
        assertEquals("(145, 20, 30)", p3.toString());
    }

    @Test
    public void testDistance() {
        int[] arr1 = { 10, 20, 30, 40 };
        Pixel p1 = new Pixel(arr1);
        int[] arr2 = { 10, 20, 30, 40 };
        Pixel p2 = new Pixel(arr2);
        arr2[0] = 145;
        Pixel p3 = new Pixel(arr2);
        // distance test
        assertEquals(135, p1.distance(p3));
        assertEquals(0, p1.distance(p2));
    }

    @Test
    public void testGetComponents() {
        int[] arr1 = { 10, 20, 30, 40 };
        Pixel p1 = new Pixel(arr1);
        int[] arr2 = { 10, 20, 30, 40 };
        Pixel p2 = new Pixel(arr2);
        arr2[0] = 145;
        Pixel p3 = new Pixel(arr2);
        int[] arr11 = { 10, 20, 30 };
        int[] arr12 = { 145, 20, 30 };

        // get components test
        assertEquals(arr11, p1.getComponents());
        assertEquals(arr12, p3.getComponents());
    }

}
