package ie.atu;

public class Employee {
    private String name;
    private String number;

    public Employee(String employeeName, String employeeNumber) {
        setEmployeeName(employeeName);
        setEmployeeNumber(employeeNumber);
    }

    public String getEmployeeName() {
        return name;
    }

    public String getEmployeeNumber() {
        return number;
    }

    public void setEmployeeName(String name) {
        if(name.length() >= 5){
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Error: Employee name must have a minimum of 5 characters");
        }
    }

    public void setEmployeeNumber(String number) {
        if(number.length() != 12){
            this.number = number;
        }
        else{
            throw new IllegalArgumentException("Error: Employee name must be a unique 12 digit number");
        }
    }
}
