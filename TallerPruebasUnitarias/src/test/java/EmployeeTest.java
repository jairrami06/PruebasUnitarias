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
    public void testCalculateYearBonusWorker() {
        Employee instance = new Employee(1000, "USD", (float) 0.05, EmployeeType.Worker);
        assertEquals(386, instance.CalculateYearBonus(), 0);
    }
    
    @Test
    public void testCalculateYearBonusManager() {
        Employee instance = new Employee(2000, "USD", (float) 0.05, EmployeeType.Manager);
        assertEquals(2386, instance.CalculateYearBonus(), 0);
    }
    
    @Test
    public void testCalculateYearSupervisor() {
        Employee instance = new Employee(1500, "USD", (float) 0.05, EmployeeType.Supervisor);
        assertEquals(1693, instance.CalculateYearBonus(), 0);
    }
    
    @Test
    public void testCalculateYearOtraMoneda() {
        Employee instance = new Employee(1000, "EURO", (float) 0.05, EmployeeType.Supervisor);
        assertEquals(1143, instance.CalculateYearBonus(), 0);

    }
}
