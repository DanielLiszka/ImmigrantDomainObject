package edu.gmu.cs321;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ImmigrantTest {
    @Test
    public void testConstruction() {
        Immigrant newImmigrant = new Immigrant("John", "Doe", "03/24/1991");
        assertTrue("John".equals(newImmigrant.firstName));
        assertTrue("Doe".equals(newImmigrant.lastName));
        assertTrue("03/24/1991".equals(newImmigrant.DOB));
    }
}