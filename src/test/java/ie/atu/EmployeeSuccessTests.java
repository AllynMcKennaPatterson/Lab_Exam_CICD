package ie.atu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeSuccessTests {
    private Employee myEmployee;

    @BeforeEach
    void setUp(){
        myEmployee = new Employee("Allyn", "123456712341");
    }

    @Test
    void testName(){
        assertEquals("Allyn", myEmployee.getEmployeeName());
    }

    @Test
    void testNumber(){
        assertEquals("123456712341", myEmployee.getEmployeeNumber());
    }
}
