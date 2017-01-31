package net.darklan.primesample;

import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName
     *         name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    public void testPrimes() {
        PrimeFinder finder = new PrimeFinder();
        List<Integer> primes = finder.calculate(100);
        assertEquals(25, primes.size());
    }
    
    public void testOnePrime() {
        PrimeFinder finder = new PrimeFinder();
        List<Integer> primes = finder.calculate(200);
        assertTrue(primes.contains(173));
    }
    
    public void testDividends() {
        PrimeFinder finder = new PrimeFinder();
        List<Integer> div = finder.findDividends(4);
        assertEquals(2, div.size());
        assertTrue(div.contains(2));
        
        div = finder.findDividends(20);
        assertEquals(5, div.size());
        assertTrue(div.contains(5));
    }
        
}
