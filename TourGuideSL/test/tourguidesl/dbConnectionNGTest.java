/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package tourguidesl;

import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author USER
 */
public class dbConnectionNGTest {
    
    public dbConnectionNGTest() {
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
     * Test of connect method, of class dbConnection.
     */
    @Test
    public void testConnect() throws Exception {
        System.out.println("connect");
        dbConnection instance = new dbConnection();
        instance.connect();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of closeConnection method, of class dbConnection.
     */
    @Test
    public void testCloseConnection() {
        System.out.println("closeConnection");
        dbConnection instance = new dbConnection();
        instance.closeConnection();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatement method, of class dbConnection.
     */
    @Test
    public void testGetStatement() {
        System.out.println("getStatement");
        dbConnection instance = new dbConnection();
        Statement expResult = null;
        Statement result = instance.getStatement();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConnection method, of class dbConnection.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        dbConnection instance = new dbConnection();
        Connection expResult = null;
        Connection result = instance.getConnection();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
