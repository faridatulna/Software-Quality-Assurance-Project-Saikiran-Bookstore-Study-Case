/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        String productName = "1";
        product instance = new product();
        int expResult = 0;
        int result = instance.getId(productName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCategory method, of class product.
     */
    @Test
    public void testGetCategory() throws Exception {
        System.out.println("getCategory");
        product instance = new product();
        ArrayList<String> expResult = new ArrayList<String>();
        expResult.add("Books");
        expResult.add("Computers");
        expResult.add("Games");
        expResult.add("Movie");
        expResult.add("Movies");
        expResult.add("Stationaries");
        ArrayList<String> result = instance.getCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSubcategory method, of class product.
     */
    @Test
    public void testGetSubcategory_0args() throws Exception {
        System.out.println("getSubcategory");
        product instance = new product();
        ArrayList<String> expResult = new ArrayList<String>(); 
        expResult.add("Academic");
        expResult.add("Action");
        expResult.add("Action (Movies)");
        expResult.add("Adventure");
        expResult.add("Colors");
        expResult.add("First Person");
        expResult.add("Horror");
        expResult.add("Pens");
        expResult.add("Puzzle");
        expResult.add("Racing");
        expResult.add("Sandbox");
        expResult.add("Sound");
        expResult.add("Sports");
        expResult.add("Storage");
        ArrayList<String> result = instance.getSubcategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSubcategory method, of class product.
     */
    @Test
    public void testGetSubcategory_String() throws Exception {
        System.out.println("getSubcategory");
        String category = "Books";
        product instance = new product();
        ArrayList<String> expResult = new ArrayList<String>();
        expResult.add("Academic");
        ArrayList<String> result = instance.getSubcategory(category);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCompany method, of class product.
     */
    @Test
    public void testGetCompany_String() throws SQLException, ClassNotFoundException {
        System.out.println("getCompany");
        String category = "Computers";
        
        product instance = new product();
        List<String> expResult = Arrays.asList();
        ArrayList<String> result = instance.getCompany(category);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCompany method, of class product.
     */
    @Test
    public void testGetCompany_0args() throws Exception {
        System.out.println("getCompany");
        product instance = new product();
        ArrayList<String> expResult = instance.getCompany();
        ArrayList<String> result = instance.getCompany();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
        //fail("The test case is a prototype.");
    }
    
}
