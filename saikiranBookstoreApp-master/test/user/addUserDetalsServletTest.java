/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

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
public class addUserDetalsServletTest {
    
    public addUserDetalsServletTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of processRequest method, of class addUserDetalsServlet.
     */
    @Test
    public void testProcessRequest() throws Exception {
        System.out.println("test method 1 : processRequest");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        addUserDetalsServlet instance = new addUserDetalsServlet();
        instance.processRequest(request, response);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of doGet method, of class addUserDetalsServlet.
     */
    @Test
    public void testDoGet() throws Exception {
        System.out.println("test method 2 : doGet");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        addUserDetalsServlet instance = new addUserDetalsServlet();
        instance.doGet(request, response);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of doPost method, of class addUserDetalsServlet.
     */
    @Test
    public void testDoPost() throws Exception {
        System.out.println("test method 3 : doPost");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        addUserDetalsServlet instance = new addUserDetalsServlet();
        instance.doPost(request, response);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getServletInfo method, of class addUserDetalsServlet.
     */
    @Test
    public void testGetServletInfo() {
        System.out.println("test method 4 : getServletInfo");
        addUserDetalsServlet instance = new addUserDetalsServlet();
        String expResult = "";
        String result = instance.getServletInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
