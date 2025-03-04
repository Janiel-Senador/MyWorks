public class Lease {
    private String name;
    private int apartmentNumber;
    private double monthlyRent;
    private int term;

    public Lease() {
        this.name = "XXX";
        this.apartmentNumber = 0;
        this.monthlyRent = 1000;
        this.term = 12;
    }

    public Lease(String name, int apartmentNumber, double monthlyRent, int term) {
        this.name = name;
        this.apartmentNumber = apartmentNumber;
        this.monthlyRent = monthlyRent;
        this.term = term;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public void addPetFee() {
        this.monthlyRent += 10;
        explainPetPolicy();
    }

    public static void explainPetPolicy() {
        System.out.println("A $10 pet fee has been added to your monthly rent.");
    }
}