/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Administrador
 */
public class EmployeeTest {

    public EmployeeTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of CalculateYearBonus method, of class Employee.
     */
    @Test
    public void testCalculateYearBonusTipo() {
        Employee instance1 = new Employee(1000, "EURO", (float) 0.05, EmployeeType.Manager);
        Employee instance2 = new Employee(1000, "EURO", (float) 0.05, EmployeeType.Worker);
        Employee instance3 = new Employee(1000, "EURO", (float) 0.05, EmployeeType.Supervisor);
        assertEquals(1, instance1.CalculateYearBonus(), 0);
        assertEquals(1,instance2.CalculateYearBonus(), 0);
        assertEquals(1,instance3.CalculateYearBonus(), 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
