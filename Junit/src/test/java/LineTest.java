/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Fayt
 */
public class LineTest {
    
    
        Line line1 = new Line(1,1,3,3);
        Line line2 = new Line(.01,.01,.09,.09);
        Line line3 = new Line(.01,.01,.05,.05);

    /**
     * Test of getSlope method, of class Line.
     */
    @Test
    public void testGetSlope() {
        System.out.println("getSlope");
        Double expResults = 1.0;
        Double result = line1.getSlope();
        assertEquals(expResults, result);
    }

    /**
     * Test of getDistance method, of class Line.
     */
    @Test
    public void testGetDistance() {
        System.out.println("getDistance");
        Line instance = null;
        Double expResults = 1.0;
        Double result = line2.getSlope();
        assertEquals(expResults, result);
    }

    /**
     * Test of parallelTo method, of class Line.
     */
    @Test
    public void testParallelTo() {
        System.out.println("parallelTo");
        boolean expResult = true;
        boolean result = line3.parallelTo(line3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
