public class Employee {
    String name;
    String surname;
    String address;


    public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress) {
        name = newEmployeeName;
        surname = newEmployeeSurname;
        address = newEmployeeAddress;
    }

    public String getEmployeeDetails() {
        return "Name: " + name + ", Surname: " + surname + ", Address: " + address;
    }

}
