public class EnergyBill {
    private String customerName;
    private String customerAddress;
    private double electricityUsage; 
    private double gasUsage; 
    
    // rates
    private static final double electricityRate = 0.22; 
    private static final double gasRate = 0.06; 
    
    // constructor
    public EnergyBill(String customerName, String customerAddress, double electricityUsage, double gasUsage) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.electricityUsage = electricityUsage;
        this.gasUsage = gasUsage;
    }
    
    // calculates electricity charge
    public double calculateElectricityCharge() {
        return electricityUsage * electricityRate;
    }
    
    // calculates gas charge
    public double calculateGasCharge() {
        return gasUsage * gasRate;
    }
    
    // calculates total charge
    public double calculateTotalCharge() {
        return calculateElectricityCharge() + calculateGasCharge();
    }
    
    // all the getters
    public String getCustomerName() {
        return customerName;
    }
    
    public String getCustomerAddress() {
        return customerAddress;
    }
    
    public double getElectricityUsage() {
        return electricityUsage;
    }
    
    public double getGasUsage() {
        return gasUsage;
    }
}
