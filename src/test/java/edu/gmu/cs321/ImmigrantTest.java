package edu.gmu.cs321;

import static org.junit.Assert.*;
import org.junit.Test;

public class ImmigrantTest {
    @Test
    public void testCreateImmigrant_ValidInput() {
        Immigrant immigrant = new Immigrant();
        String result = immigrant.createImmigrant("John", "Doe", "123-45-6789", "05/05/1998", "Example Street", "City", "VA", 12345, "john.doe@email.com");
        assertEquals("123-45-6789", result);
    }

    @Test
    public void testCreateImmigrant_InvalidInput() {
        Immigrant immigrant = new Immigrant();
        String result = immigrant.createImmigrant("", "", "", "", "", "", "", 0, "");
        assertEquals("Invalid Input", result);
    }

    @Test
    public void testGetImmigrant_ValidID() {
        Immigrant immigrant = new Immigrant();
        Immigrant fetched = immigrant.getImmigrant(10);
        assertNotNull(fetched);
        assertEquals(10, fetched.getImmigrantID());
    }

    @Test
    public void testGetImmigrant_InvalidID() {
        Immigrant immigrant = new Immigrant();
        Immigrant fetched = immigrant.getImmigrant(-1);
        assertNull(fetched);
    }

    @Test
    public void testUpdateImmigrant_ValidInput() {
        Immigrant immigrant = new Immigrant();
        Immigrant updated = new Immigrant(2, "John", "Doe", "123-45-6789", "05/05/1998", "Example Street", "City", "VA", 12345, "john.doe@email.com");
        String result = immigrant.updateImmigrant(updated);
        assertEquals("Success", result);
    }

    @Test
    public void testUpdateImmigrant_InvalidInput() {
        Immigrant immigrant = new Immigrant();
        Immigrant updated = new Immigrant(0, "", "", "", "", "", "", "", 0, "");
        String result = immigrant.updateImmigrant(updated);
        assertEquals("Invalid Input field in the updatedImmigrant object", result);
    }
}
