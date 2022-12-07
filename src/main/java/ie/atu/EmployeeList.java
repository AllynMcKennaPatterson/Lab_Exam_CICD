package ie.atu;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

    List<Employee> listOfEmployees = new ArrayList<>();

    void addEmployee(Employee newEmployee){
        if(listOfEmployees.contains(newEmployee.getEmployeeNumber()) == false){
            listOfEmployees.add(newEmployee);
        }
        else{
            throw new IllegalArgumentException("Duplicate Employee details found, no object added");
        }
    }

    public int getListSize(){
        return listOfEmployees.size();
    }
}
