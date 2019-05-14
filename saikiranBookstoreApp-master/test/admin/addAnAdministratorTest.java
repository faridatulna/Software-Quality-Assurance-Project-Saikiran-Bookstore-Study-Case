/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class addAnAdministratorTest {
    
    public addAnAdministratorTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("* addAnAdministratorJUnit4Test: @BeforeClass method");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("* addAnAdministratorJUnit4Test: @AfterClass method");
    }
    
    @Before
    public void setUp() {
        System.out.println("* addAnAdministratorJUnit4Test: @Before method");
    }
    
    @After
    public void tearDown() {
        System.out.println("* addAnAdministratorJUnit4Test: @After method");
    }

    /**
     * Test of processRequest method, of class addAnAdministrator.
     */
    @Test
    public void testProcessRequest() throws Exception {
        System.out.println("test method 1 : processRequest");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        addAnAdministrator instance = new addAnAdministrator();
        instance.processRequest(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doPost method, of class addAnAdministrator.
     */
    @Test
    public void testDoPost() throws Exception {
        System.out.println("test method 2 : doPost");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        addAnAdministrator instance = new addAnAdministrator();
        instance.doPost(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doGet method, of class addAnAdministrator.
     */
    @Test
    public void testDoGet() throws Exception {
        System.out.println("test method 3 : doGet");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        addAnAdministrator instance = new addAnAdministrator();
        instance.doGet(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServletInfo method, of class addAnAdministrator.
     */
    @Test
    public void testGetServletInfo() {
        System.out.println("test method 4 : getServletInfo");
        addAnAdministrator instance = new addAnAdministrator();
        String expResult = "Short description";
        String result = instance.getServletInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
