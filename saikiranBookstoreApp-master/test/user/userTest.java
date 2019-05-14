/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

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
public class userTest {
    
    public userTest() {
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
     * Test of setUserEmail method, of class user.
     */
    @Test
    public void testSetUserEmail() throws Exception {
        System.out.println("setUserEmail");
        String userEmail = "";
        user instance = new user();
        instance.setUserEmail(userEmail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserEmail method, of class user.
     */
    @Test
    public void testGetUserEmail() {
        System.out.println("getUserEmail");
        user instance = new user();
        String expResult = "";
        String result = instance.getUserEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserId method, of class user.
     */
    @Test
    public void testGetUserId() {
        System.out.println("getUserId");
        user instance = new user();
        int expResult = 0;
        int result = instance.getUserId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class user.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        user instance = new user();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class user.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        user instance = new user();
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGender method, of class user.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        user instance = new user();
        String expResult = "";
        String result = instance.getGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMobileNum method, of class user.
     */
    @Test
    public void testGetMobileNum() {
        System.out.println("getMobileNum");
        user instance = new user();
        String expResult = "";
        String result = instance.getMobileNum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserImage method, of class user.
     */
    @Test
    public void testGetUserImage() {
        System.out.println("getUserImage");
        user instance = new user();
        String expResult = "";
        String result = instance.getUserImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findUserId method, of class user.
     */
    @Test
    public void testFindUserId() throws Exception {
        System.out.println("findUserId");
        String email = "";
        user instance = new user();
        int expResult = 0;
        int result = instance.findUserId(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fetchAllValues method, of class user.
     */
    @Test
    public void testFetchAllValues() throws Exception {
        System.out.println("fetchAllValues");
        int userId = 0;
        user instance = new user();
        boolean expResult = false;
        boolean result = instance.fetchAllValues(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class user.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        user.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
