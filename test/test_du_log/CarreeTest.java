/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_du_log;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mohammed mallat , nawres mahfoudhi et ghada setti 
 */
public class CarreeTest {
    
    public CarreeTest() {
    }

    /**
     * Test of zone method, of class Carree.
     */
    @Test
    public void testZone() {
        Carree s = new Carree (2);
        double expected = 4;
        double actual = s.zone();
        assertEquals(expected,actual,0.001);
    }

    /**
     * Test of setsidelength method, of class Carree.
     */
    @Test
    public void testSetsidelength() {
    }
    
}
