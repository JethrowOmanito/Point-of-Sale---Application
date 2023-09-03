/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package javafxapplication9;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Jethrow Cruz
 */
public class dashboardControllerNGTest {
    
    public dashboardControllerNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of addProductsAdd method, of class dashboardController.
     */
    @Test
    public void testAddProductsAdd() {
        System.out.println("addProductsAdd");
        dashboardController instance = new dashboardController();
        instance.addProductsAdd();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProductsImporImage method, of class dashboardController.
     */
    @Test
    public void testAddProductsImporImage() {
        System.out.println("addProductsImporImage");
        dashboardController instance = new dashboardController();
        instance.addProductsImporImage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProductListType method, of class dashboardController.
     */
    @Test
    public void testAddProductListType() {
        System.out.println("addProductListType");
        dashboardController instance = new dashboardController();
        instance.addProductListType();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProductListStatus method, of class dashboardController.
     */
    @Test
    public void testAddProductListStatus() {
        System.out.println("addProductListStatus");
        dashboardController instance = new dashboardController();
        instance.addProductListStatus();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProductsListData method, of class dashboardController.
     */
    @Test
    public void testAddProductsListData() {
        System.out.println("addProductsListData");
        dashboardController instance = new dashboardController();
        ObservableList expResult = null;
        ObservableList result = instance.addProductsListData();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProductShowListData method, of class dashboardController.
     */
    @Test
    public void testAddProductShowListData() {
        System.out.println("addProductShowListData");
        dashboardController instance = new dashboardController();
        instance.addProductShowListData();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProductsSelect method, of class dashboardController.
     */
    @Test
    public void testAddProductsSelect() {
        System.out.println("addProductsSelect");
        dashboardController instance = new dashboardController();
        instance.addProductsSelect();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of switchForm method, of class dashboardController.
     */
    @Test
    public void testSwitchForm() {
        System.out.println("switchForm");
        ActionEvent event = null;
        dashboardController instance = new dashboardController();
        instance.switchForm(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logout method, of class dashboardController.
     */
    @Test
    public void testLogout() {
        System.out.println("logout");
        dashboardController instance = new dashboardController();
        instance.logout();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class dashboardController.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        dashboardController instance = new dashboardController();
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of minimize method, of class dashboardController.
     */
    @Test
    public void testMinimize() {
        System.out.println("minimize");
        dashboardController instance = new dashboardController();
        instance.minimize();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initialize method, of class dashboardController.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        URL location = null;
        ResourceBundle resources = null;
        dashboardController instance = new dashboardController();
        instance.initialize(location, resources);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
