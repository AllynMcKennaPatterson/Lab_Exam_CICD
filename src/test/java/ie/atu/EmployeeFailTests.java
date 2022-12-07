package ie.atu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeFailTests {

    @Test
    void testNameFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new Employee("Al", "123456712341"));
        assertEquals("Error: Employee name must have a minimum of 5 characters", exMessage.getMessage());
    }

    @Test
    void testNumberFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new Employee("Allyn", "12345"));
        assertEquals("Error: Employee name must be a unique 12 digit number", exMessage.getMessage());
    }
}
