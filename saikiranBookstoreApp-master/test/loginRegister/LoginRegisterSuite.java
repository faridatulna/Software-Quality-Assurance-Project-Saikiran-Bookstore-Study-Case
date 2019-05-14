/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginRegister;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author User
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({loginRegister.changeMyPasswordTest.class, loginRegister.loginServletTest.class, loginRegister._logoutServletTest.class, loginRegister.registerServletTest.class, loginRegister.admin_loginTest.class, loginRegister.changeMyPassTest.class})
public class LoginRegisterSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
