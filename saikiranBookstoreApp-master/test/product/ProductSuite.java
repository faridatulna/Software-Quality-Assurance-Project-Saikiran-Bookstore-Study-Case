/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import product.addProductPack.AddProductPackSuite;

/**
 *
 * @author User
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({productBeanTest.class, removeCompanyTest.class, getProductSubCategoryTest.class, addCompanyTest.class, addProductTest.class, removeSubCategoryTest.class, productTest.class, AddProductPackSuite.class, buyItemsTest.class, addCategoryTest.class, removeCartProductTest.class, addSubCategoryTest.class, removeCategoryTest.class})
public class ProductSuite {

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
