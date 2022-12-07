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

    void deleteEmployee(Employee newEmployee){
        if(listOfEmployees.contains(newEmployee.getEmployeeNumber()) == true){
            listOfEmployees.remove(newEmployee);
        }
        else{
            throw new IllegalArgumentException("No matching Employee is found");
        }
    }

    public int getListSize(){
        return listOfEmployees.size();
    }
}
