package ie.atu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListSuccessTests {

    List<Employee> listOfEmployees = new ArrayList<>();
    private Employee myEmployeeObject;

    @BeforeEach
    void setUp(){
        myEmployeeObject = new Employee("Allyn", "123456712341");
    }

    @Test
    void testAddEmployee(Employee myEmployee){
        assertEquals(listOfEmployees.size(), listOfEmployees.getSize() + 1);
    }
}
