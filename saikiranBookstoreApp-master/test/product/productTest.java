/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

import java.util.ArrayList;
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
public class productTest {
    
    public productTest() {
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
     * Test of getId method, of class product.
     */
    @Test
    public void testGetId() throws Exception {
        System.out.println("getId");
        String productName = "";
        product instance = new product();
        int expResult = 0;
        int result = instance.getId(productName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategory method, of class product.
     */
    @Test
    public void testGetCategory() throws Exception {
        System.out.println("getCategory");
        product instance = new product();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubcategory method, of class product.
     */
    @Test
    public void testGetSubcategory_0args() throws Exception {
        System.out.println("getSubcategory");
        product instance = new product();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getSubcategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubcategory method, of class product.
     */
    @Test
    public void testGetSubcategory_String() throws Exception {
        System.out.println("getSubcategory");
        String category = "";
        product instance = new product();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getSubcategory(category);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompany method, of class product.
     */
    @Test
    public void testGetCompany_String() throws Exception {
        System.out.println("getCompany");
        String category = "";
        product instance = new product();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getCompany(category);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompany method, of class product.
     */
    @Test
    public void testGetCompany_0args() throws Exception {
        System.out.println("getCompany");
        product instance = new product();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getCompany();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class product.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        product.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
