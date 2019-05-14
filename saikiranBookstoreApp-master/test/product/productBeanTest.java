/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

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
public class productBeanTest {
    
    public productBeanTest() {
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
     * Test of getCompany method, of class productBean.
     */
    @Test
    public void testGetCompany() {
        System.out.println("test method 1 : getCompany");
        productBean instance = new productBean();
        String expResult = null;
        String result = instance.getCompany();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCompany method, of class productBean.
     */
    @Test
    public void testSetCompany() {
        System.out.println("test method 2 : setCompany");
        String company = "Dell";
        productBean instance = new productBean();
        instance.setCompany(company);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCategory method, of class productBean.
     */
    @Test
    public void testGetCategory() {
        System.out.println("test method 3 : getCategory");
        productBean instance = new productBean();
        String expResult = null;
        String result = instance.getCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCategory method, of class productBean.
     */
    @Test
    public void testSetCategory() {
        System.out.println("test method 3 : setCategory");
        String category = "";
        productBean instance = new productBean();
        instance.setCategory(category);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSubcategory method, of class productBean.
     */
    @Test
    public void testGetSubcategory() {
        System.out.println("test method 4 : getSubcategory");
        productBean instance = new productBean();
        String expResult = null;
        String result = instance.getSubcategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSubcategory method, of class productBean.
     */
    @Test
    public void testSetSubcategory() {
        System.out.println("test method 5 : setSubcategory");
        String subcategory = "";
        productBean instance = new productBean();
        instance.setSubcategory(subcategory);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class productBean.
     */
    @Test
    public void testGetName() {
        System.out.println("test method 6 : getName");
        productBean instance = new productBean();
        String expResult = null;
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class productBean.
     */
    @Test
    public void testSetName() {
        System.out.println("test method 7 : setName");
        String name = "";
        productBean instance = new productBean();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class productBean.
     */
    @Test
    public void testGetPrice() {
        System.out.println("test method 8 : getPrice");
        productBean instance = new productBean();
        String expResult = null;
        String result = instance.getPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class productBean.
     */
    @Test
    public void testSetPrice() {
        System.out.println("test method 9 : setPrice");
        String price = "";
        productBean instance = new productBean();
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantity method, of class productBean.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("test method 10 : getQuantity");
        productBean instance = new productBean();
        String expResult = null;
        String result = instance.getQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantity method, of class productBean.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("test method 11 : setQuantity");
        String quantity = "";
        productBean instance = new productBean();
        instance.setQuantity(quantity);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTags method, of class productBean.
     */
    @Test
    public void testGetTags() {
        System.out.println("test method 12 : getTags");
        productBean instance = new productBean();
        String expResult = null;
        String result = instance.getTags();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTags method, of class productBean.
     */
    @Test
    public void testSetTags() {
        System.out.println("test method 13 : setTags");
        String tags = "";
        productBean instance = new productBean();
        instance.setTags(tags);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSummary method, of class productBean.
     */
    @Test
    public void testGetSummary() {
        System.out.println("test method 14 : getSummary");
        productBean instance = new productBean();
        String expResult = null;
        String result = instance.getSummary();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSummary method, of class productBean.
     */
    @Test
    public void testSetSummary() {
        System.out.println("test method 15 : setSummary");
        String summary = "";
        productBean instance = new productBean();
        instance.setSummary(summary);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
