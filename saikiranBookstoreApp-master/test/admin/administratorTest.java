/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

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
public class administratorTest {
    
    public administratorTest() {
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
     * Test of getListsOfAdmin method, of class administrator.
     */
    @Test
    public void testGetListsOfAdmin() throws Exception {
        System.out.println("test method 1 : getListsOfAdmin");
        administrator instance = new administrator();
        ArrayList<String> expResult = instance.listsOfAdmin;
        ArrayList<String> result = instance.getListsOfAdmin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAdmin_email method, of class administrator.
     */
    @Test
    public void testGetAdmin_email() {
        System.out.println("test method 2 : getAdmin_email");
        administrator instance = new administrator();
        String expResult = instance.admin_email;
        String result = instance.getAdmin_email();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAdmin_email method, of class administrator.
     */
    @Test
    public void testSetAdmin_email() {
        System.out.println("test method 3 : setAdmin_email");
        String admin_email = "deadnight7@gmail.com";
        administrator instance = new administrator();
        instance.setAdmin_email(admin_email);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
