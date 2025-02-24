/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author IT20
 */
public class Testadd {
    
   @Test
    public void testAddition() {
        int result = 2 + 3;
        assertEquals(5, result);
    }

    @Test
    public void testString() {
        String str = "Hello, NetBeans!";
        assertNotNull(str);
    }
}