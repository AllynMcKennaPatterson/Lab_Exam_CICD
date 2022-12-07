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
        int initialSize;
        initialSize = listOfEmployees.size();
        listOfEmployees.add(myEmployee);
        assertEquals(listOfEmployees.size(), initialSize + 1);
    }

    @Test
    void testDeleteEmployee(Employee myEmployee){
        int initialSize;
        initialSize = listOfEmployees.size();
        listOfEmployees.remove(myEmployee);
        assertEquals(listOfEmployees.size(), initialSize - 1);
    }
}
