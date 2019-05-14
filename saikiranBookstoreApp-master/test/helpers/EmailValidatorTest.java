/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

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
public class EmailValidatorTest {
    
    public EmailValidatorTest() {
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
     * Test of validate method, of class EmailValidator.
     */
    @Test
    public void testValidate() {
        System.out.println("test method 1 : validate");
        String hex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        EmailValidator instance = new EmailValidator();
        boolean expResult = false;
        boolean result = instance.validate(hex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class EmailValidator.
     */
    @Test
    public void testMain() {
        System.out.println("test method 2 : main");
        String[] arg = { "bau@gmail.com","a@gmail.com" };
        EmailValidator.main(arg);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
