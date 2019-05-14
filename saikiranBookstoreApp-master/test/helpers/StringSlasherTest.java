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
public class StringSlasherTest {
    
    public StringSlasherTest() {
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
     * Test of sqlSlasher method, of class StringSlasher.
     */
    @Test
    public void testSqlSlasher() {
        System.out.println("sqlSlasher");
        String sql = "";
        StringSlasher instance = new StringSlasher();
        instance.sqlSlasher(sql);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class StringSlasher.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        StringSlasher.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
