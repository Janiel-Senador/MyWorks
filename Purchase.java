
class Purchase {
    private int invoiceNumber;
    private double saleAmount;
    private double salesTax;
    
    // Sales tax rate (Assuming 5%)
    private static final double TAX_RATE = 0.05;

    // Constructor
    public Purchase(int invoiceNumber, double saleAmount) {
        this.invoiceNumber = invoiceNumber;
        this.saleAmount = saleAmount;
        this.salesTax = saleAmount * TAX_RATE;
    }

    // Display method
    public void display() {
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Sale Amount: $" + saleAmount);
        System.out.println("Sales Tax: $" + salesTax);
        System.out.println("------------------------------");
    }
}