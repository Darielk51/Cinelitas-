/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Service;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jvlan
 */
public class SalaTest {
    
    public SalaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getAllConcert method, of class SalaSer.
     */
    @Test
    public void testGetAllConcert() {
        System.out.println("getAllSal");
        SalaSer instance = new SalaSer();
        List<SalaSer> expResult = null;
        List<SalaSer> result = instance.getAllSal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConcertById method, of class SalaSer.
     */
    @Test
    public void testGetConcertById() {
        System.out.println("getSalById");
        long id = 0L;
        SalaSer instance = new SalaSer();
        SalaSer expResult = null;
        SalaSer result = instance.getSalById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveConcert method, of class SalaSer.
     */
    @Test
    public void testSaveConcert() {
        System.out.println("saveSala");
        Object sala = null;
        SalaSer instance = new SalaSer();
        instance.saveConcert((SalaSer) sala);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class SalaSer.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        long id = 0L;
        SalaSer instance = new SalaSer();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
