
public class Badge {

    public static int totalNumberOfEmployees = 0;

    String badgeIdCode;
    Employee employee;

    public void keepTrackOfEmployeesNumber() {
        totalNumberOfEmployees++;
    }

    public String generateBadgeIdCode() {
        String code1 = "XYZ";
        String code2 = "ZYX";
        return code1 + employee.name + employee.surname + code2;
    }

    public Badge(Employee employeeThatNeedsBadge) {
        employee = employeeThatNeedsBadge;
        keepTrackOfEmployeesNumber();
        badgeIdCode = generateBadgeIdCode();
    }

    public void showBadgeDetails() {

        System.out.println("Employee detail: " + employee.getEmployeeDetails());
        System.out.println("Badge code number: " + badgeIdCode);
    }
}
