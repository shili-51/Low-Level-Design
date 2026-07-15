public class Main{
    public static void main(String[] args){
        Marker marker = new Marker("classmate", "red", 20);

        // Without Single Responsibility Model
//        MarkerOps markerOps = new MarkerOps();
//        markerOps.calculateTotal(marker);

        // Assigning separate responsibility to separate classes - SRP
        InvoicePrinter invoicePrinter = new InvoicePrinter();
        invoicePrinter.printInvoice(marker);
        MarkerPricingStrategy markerPricingStrategy = new MarkerPricingStrategy();
        markerPricingStrategy.calculateTotal(marker);
        MarkerRepository markerRepo = new MarkerRepository();
        markerRepo.saveToDB(marker);
    }
}

