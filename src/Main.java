import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // customer details input
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        
        System.out.print("Enter customer address: ");
        String customerAddress = scanner.nextLine();
        
        System.out.print("Enter electricity usage in kWh: ");
        double electricityUsage = scanner.nextDouble();
        
        System.out.print("Enter gas usage in units: ");
        double gasUsage = scanner.nextDouble();
        
        System.out.print("Is this a green energy customer? (yes/no): ");
        String greenEnergyResponse = scanner.next();
        
        // bills 
        if (greenEnergyResponse.equalsIgnoreCase("yes")) {
            System.out.print("Enter solar energy contribution in kWh: ");
            double solarEnergyContribution = scanner.nextDouble();
            
            GreenEnergyBill greenBill = new GreenEnergyBill(customerName, customerAddress, electricityUsage, gasUsage, solarEnergyContribution);
            System.out.println("\n--- Green Energy Bill ---");
            System.out.println("Customer Name: " + greenBill.getCustomerName());
            System.out.println("Customer Address: " + greenBill.getCustomerAddress());
            System.out.println("Electricity Usage: " + greenBill.getElectricityUsage() + " kWh");
            System.out.println("Gas Usage: " + greenBill.getGasUsage() + " units");
            System.out.println("Solar Energy Contribution: " + greenBill.getSolarEnergyContribution() + " kWh");
            System.out.println("Electricity Charge: $" + greenBill.calculateElectricityCharge());
            System.out.println("Gas Charge: $" + greenBill.calculateGasCharge());
            System.out.println("Total Charge: $" + greenBill.calculateTotalCharge());
        } else {
            EnergyBill bill = new EnergyBill(customerName, customerAddress, electricityUsage, gasUsage);
            System.out.println("\n--- Standard Energy Bill ---");
            System.out.println("Customer Name: " + bill.getCustomerName());
            System.out.println("Customer Address: " + bill.getCustomerAddress());
            System.out.println("Electricity Usage: " + bill.getElectricityUsage() + " kWh");
            System.out.println("Gas Usage: " + bill.getGasUsage() + " units");
            System.out.println("Electricity Charge: $" + bill.calculateElectricityCharge());
            System.out.println("Gas Charge: $" + bill.calculateGasCharge());
            System.out.println("Total Charge: $" + bill.calculateTotalCharge());
        }
        
        scanner.close();
    }
}
