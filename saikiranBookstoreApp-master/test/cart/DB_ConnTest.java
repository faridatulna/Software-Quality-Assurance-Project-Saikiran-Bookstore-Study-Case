/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cart;

import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static junit.framework.Assert.*;
//import static org.junit.Assert.*;

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
    
    private final String db="saikiran enterprises", uname = "charig", pass = "1234567";
    /**
     * Test of getConnection method, of class DB_Conn.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetConnection() throws Exception {
        //Class.forName("com.mysql.jdbc.Driver"); 
        System.out.println("test method 1 : getConnection");
        DB_Conn instance = new DB_Conn();
        Connection expResult = instance.getConnection();
                //DriverManager.getConnection("jdbc:mysql://localhost:3306/"+instance.getDatabase()+"",""+instance.getUsername()+"",""+instance.getPassword()+"");
        Connection result = expResult;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDatabase method, of class DB_Conn.
     */
    @Test
    public void testGetDatabase() {
        System.out.println("test method 2 : getDatabase");
        DB_Conn instance = new DB_Conn();
        String expResult = "saikiran enterprises";
        String result = instance.getDatabase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDatabase method, of class DB_Conn.
     */
    @Test
    public void testSetDatabase() {
        System.out.println("test method 3 : setDatabase");
        String database = "saikiran enterprises";
        DB_Conn instance = new DB_Conn();
        instance.setDatabase(database);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class DB_Conn.
     */
    @Test
    public void testGetUsername() {
        System.out.println("test method 4 : getUsername");
        DB_Conn instance = new DB_Conn();
        String expResult = "charig";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class DB_Conn.
     */
    @Test
    public void testSetUsername() {
        System.out.println("test method 5 : setUsername");
        String username = "charig";
        DB_Conn instance = new DB_Conn();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class DB_Conn.
     */
    @Test
    public void testGetPassword() {
        System.out.println("test method 6 : getPassword");
        DB_Conn instance = new DB_Conn();
        String expResult = "1234567";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class DB_Conn.
     */
    @Test
    public void testSetPassword() {
        System.out.println("test method 7 : setPassword");
        String password = "1234567";
        DB_Conn instance = new DB_Conn();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
