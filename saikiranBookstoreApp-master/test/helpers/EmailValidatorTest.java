/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import java.io.PrintStream;
import java.util.Scanner;
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
        System.out.println("validate");
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
    public void testMain_StringArr() {
        System.out.println("main");
        String[] arg = {"admin@admin.com"};
        EmailValidator.main(arg);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class EmailValidator.
     */
    @Test
    public void testMain(){
        EmailValidator instance = new EmailValidator();
        System.out.println("main");
        String[] arg = null;
        String email = "a@a.com";
        EmailValidator.main(arg);
        boolean a = instance.validate(email);
        assertEquals(a, false);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
}
