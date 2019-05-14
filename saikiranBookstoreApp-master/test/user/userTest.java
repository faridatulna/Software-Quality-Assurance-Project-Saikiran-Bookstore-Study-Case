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
        System.out.println("test method 1 : setUserEmail");
        String userEmail = "dead.night7@gmail.com";
        user instance = new user();
        instance.setUserEmail(userEmail);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getUserEmail method, of class user.
     */
    @Test
    public void testGetUserEmail() {
        System.out.println("test method 2 : getUserEmail");
        user instance = new user();
        String expResult = "dead.night7@gmail.com";
        String result = instance.getUserEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getUserId method, of class user.
     */
    @Test
    public void testGetUserId() {
        System.out.println("test method 3 : getUserId");
        user instance = new user();
        int expResult = 1;
        int result = instance.getUserId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class user.
     */
    @Test
    public void testGetUsername() {
        System.out.println("test method 4 : getUsername");
        user instance = new user();
        String expResult = "Chirag Pandit";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class user.
     */
    @Test
    public void testGetAddress() {
        System.out.println("test method 5 : getAddress");
        user instance = new user();
        String expResult = "B-10, 102 SilverPark, Mira Bhyendar Road, Mira Road east";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGender method, of class user.
     */
    @Test
    public void testGetGender() {
        System.out.println("test method 6 : getGender");
        user instance = new user();
        String expResult = "male";
        String result = instance.getGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMobileNum method, of class user.
     */
    @Test
    public void testGetMobileNum() {
        System.out.println("test method 7 : getMobileNum");
        user instance = new user();
        String expResult = "9004300";
        String result = instance.getMobileNum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getUserImage method, of class user.
     */
    @Test
    public void testGetUserImage() {
        System.out.println("test method 8 : getUserImage");
        user instance = new user();
        String expResult = null;
        String result = instance.getUserImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of findUserId method, of class user.
     */
    @Test
    public void testFindUserId() throws Exception {
        System.out.println("test method 9 : findUserId");
        String email = "dead.night7@gmail.com";
        user instance = new user();
        int expResult = 1;
        int result = instance.findUserId(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of fetchAllValues method, of class user.
     */
    @Test
    public void testFetchAllValues() throws Exception {
        System.out.println("test method 10 : fetchAllValues");
        int userId = 1;
        user instance = new user();
        boolean expResult = false;
        boolean result = instance.fetchAllValues(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class user.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("test method 11 : main");
        String[] args = null;
        user.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
