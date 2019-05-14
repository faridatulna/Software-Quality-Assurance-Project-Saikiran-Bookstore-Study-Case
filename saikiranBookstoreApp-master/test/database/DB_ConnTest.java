/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
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
public class DB_ConnTest {
    
    public DB_ConnTest() {
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
     * Test of getConnection method, of class DB_Conn.
     */
    @Test
    public void testGetConnection() throws Exception {
        System.out.println("getConnection");
        DB_Conn instance = new DB_Conn();
        Connection expResult = null;
        Connection result = instance.getConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDatabase method, of class DB_Conn.
     */
    @Test
    public void testGetDatabase() {
        System.out.println("getDatabase");
        DB_Conn instance = new DB_Conn();
        String expResult = "";
        String result = instance.getDatabase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDatabase method, of class DB_Conn.
     */
    @Test
    public void testSetDatabase() {
        System.out.println("setDatabase");
        String database = "";
        DB_Conn instance = new DB_Conn();
        instance.setDatabase(database);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class DB_Conn.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        DB_Conn instance = new DB_Conn();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class DB_Conn.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        DB_Conn instance = new DB_Conn();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class DB_Conn.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        DB_Conn instance = new DB_Conn();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class DB_Conn.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        DB_Conn instance = new DB_Conn();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
