public class GreenEnergyBill extends EnergyBill {
    private double solarEnergyContribution;
    
    // constructor
    public GreenEnergyBill(String customerName, String customerAddress, double electricityUsage, double gasUsage, double solarEnergyContribution) {
        super(customerName, customerAddress, electricityUsage, gasUsage);
        this.solarEnergyContribution = solarEnergyContribution;
    }
    
    // calculates electricity charge with solar energy deduction
    @Override
    public double calculateElectricityCharge() {
        double netElectricityUsage = getElectricityUsage() - solarEnergyContribution;
        netElectricityUsage = netElectricityUsage < 0 ? 0 : netElectricityUsage; 
        return netElectricityUsage * 0.12;
    }
    
    // method for solar energy contribution
    public double getSolarEnergyContribution() {
        return solarEnergyContribution;
    }
    
    // total charge for green energy discount
    @Override
    public double calculateTotalCharge() {
        return calculateElectricityCharge() + calculateGasCharge();
    }
}
