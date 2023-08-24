/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jaira
 */
public class calculateSalaryTest {
    
    /**
     * Test of cs method, of class Employee.
    */
    
    public void testUSDManager () {
        Employee eManager = new Employee(3000, "USD", 6F, EmployeeType.Manager);
        assertEquals(3004.20,eManager.cs(),2);
    }
    
    public void testUSDWorker () {
        Employee eWorker = new Employee(1000, "USD", 3F, EmployeeType.Worker);
        assertEquals(1000,eWorker.cs(),2);
    }
        
    public void testUSDSupervisor () {
        Employee eSupervisor = new Employee(5000, "USD", 9F, EmployeeType.Supervisor);
        assertEquals(5003.15,eSupervisor.cs(),2);
    }
    
    public void testOtraMonedaParManager () {
        Employee eManager = new Employee(3000, "EUR", 6F, EmployeeType.Manager);        
        assertEquals(2854.20,eManager.cs(),2);

    }
    
    public void testOtraMonedaParWorker () {
        Employee eWorker = new Employee(1000, "EUR", 3F, EmployeeType.Worker);        
        assertEquals(950,eWorker.cs(),2);
    }
    
    public void testOtraMonedaParSupervisor () {
        Employee eSupervisor = new Employee(5000, "EUR", 9F, EmployeeType.Supervisor);
        assertEquals(4753.15,eSupervisor.cs(),2);
    }
}
