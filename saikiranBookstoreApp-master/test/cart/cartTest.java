
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cart;

import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.Scanner;


/**
 *
 * @author User
 */
public class cartTest {
    
    public cartTest() {
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
     * Test of showProducts method, of class cart.
     */
    @Test
    public void testShowProducts() {
        System.out.println("test method 1 : showProducts");
        cart instance = new cart();
        ArrayList<String> expResult = instance.res;
        ArrayList<String> result = instance.showProducts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listItemsOfCart method, of class cart.
     * @throws java.lang.Exception
     */
    @Test
    public void testListItemsOfCart() throws Exception {
        System.out.println("test method 2 : listItemsOfCart");
        cart instance = new cart();
        instance.listItemsOfCart();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProductCategorys method, of class cart.
     */
    @Test
    public void testGetProductCategorys() {
        System.out.println("test method 3 : getProductCategorys");
        cart instance = new cart();
        ArrayList<String> expResult = instance.productCategory;
        ArrayList<String> result = instance.getProductCategorys();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProductNames method, of class cart.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetProductNames() throws Exception {
        System.out.println("test method 4 : getProductNames");
        cart instance = new cart();
        ArrayList<String> expResult = instance.productName;
        ArrayList<String> result = instance.getProductNames();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrices method, of class cart.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetPrices() throws Exception {
        System.out.println("test method 5 : getPrices");
        cart instance = new cart();
        ArrayList<Double> expResult = instance.prices;
        ArrayList<Double> result = instance.getPrices();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProductName method, of class cart.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetProductName() throws Exception {
        System.out.println("test method 6 : getProductName");
        int id = 2;
        cart instance = new cart();
        String expResult = "Grand Theft Auto IV";
        String result = instance.getProductName(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProductCategory method, of class cart.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetProductCategory() throws Exception {
        System.out.println("test method 7 : getProductCategory");
        int id = 2;
        cart instance = new cart();
        String expResult = "Games";
        String result = instance.getProductCategory(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProductPrice method, of class cart.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetProductPrice() throws Exception {
        System.out.println("test method 8 : getProductPrice");
        int id = 2;
        cart instance = new cart();
        double expResult = 460.0;
        double result = instance.getProductPrice(id);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPriceOfCart method, of class cart.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetTotalPriceOfCart() throws Exception {
        System.out.println("test method 9 : getTotalPriceOfCart");
        cart instance = new cart();
        double expResult = 50.0;
        double result = instance.getTotalPriceOfCart();
        assertEquals(expResult, result, 50.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getQty method, of class cart.
     */
    @Test
    public void testGetQty() {
        System.out.println("test method 10 : getQty");
        cart instance = new cart();
        ArrayList<Integer> expResult = instance.qty;
        ArrayList<Integer> result = instance.getQty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class cart.
     */
    @Test
    public void testGetId() {
        System.out.println("test method 11 : getId");
        cart instance = new cart();
        ArrayList<Integer> expResult = instance.id;
        ArrayList<Integer> result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addProduct method, of class cart.
     * @throws java.lang.Exception
     */
    @Test
    public void testAddProduct() throws Exception {
        System.out.println("test method 12 : addProduct");
        int id = 1;
        cart instance = new cart();
        //boolean expResult = false;
        boolean expResult = true;
        boolean result = instance.addProduct(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeProduct method, of class cart.
     */
    @Test
    public void testRemoveProduct() {
        System.out.println("test method 13 : removeProduct");
        int productId = 0;
        cart instance = new cart();
        boolean expResult = false;
        //boolean expResult = true;
        boolean result = instance.removeProduct(productId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class cart.
     * @throws java.lang.Exception
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("test method 14 : main");
        String[] args = null;
        cart.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
