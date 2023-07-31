

public class Test {


    public static void main(String[] args) {

        Employee employee1 = new Employee("Alessio", "Relis", "Via Pascoli 13");
        Badge badge1 = new Badge(employee1);

        Employee employee2 = new Employee("Claudio", "Carta", "Via Pisano 22");
        Badge badge2 = new Badge(employee2);

        Employee employee3 = new Employee("Alessandro", "Masala","Via Corti 94");
        Badge badge3 = new Badge(employee3);


        System.out.println("Employee 1's Badge Details are:");
        badge1.showBadgeDetails();

        System.out.println("Employee 2's Badge Details are:");
        badge2.showBadgeDetails();

        System.out.println("Employee 3's Badge Details are:");
        badge3.showBadgeDetails();

        System.out.println("Total number of employee is: " + Badge.totalNumberOfEmployees);

    }
}
