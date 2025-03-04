import java.util.Scanner;

public class TestLease {
    public static void main(String[] args) {
        Lease lease1 = getData();
        Lease lease2 = getData();
        Lease lease3 = getData();
        Lease lease4 = new Lease();

        showValues(lease1);
        lease1.addPetFee();
        showValues(lease1);

        showValues(lease2);
        showValues(lease3);
        showValues(lease4);
    }

    public static Lease getData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter tenant's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter apartment number: ");
        int apartmentNumber = scanner.nextInt();

        System.out.print("Enter monthly rent: ");
        double monthlyRent = scanner.nextDouble();

        System.out.print("Enter term of lease (months): ");
        int term = scanner.nextInt();

        scanner.close();

        return new Lease(name, apartmentNumber, monthlyRent, term);
    }

    public static void showValues(Lease lease) {
        System.out.println("Tenant's name: " + lease.getName());
        System.out.println("Apartment number: " + lease.getApartmentNumber());
        System.out.println("Monthly rent: $" + lease.getMonthlyRent());
        System.out.println("Term of lease: " + lease.getTerm() + " months");
        System.out.println();
    }
}
