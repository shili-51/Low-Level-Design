// violation of single responsibility model
// MarkerOps violates the Single Responsibility Principle because it handles persistence, invoice generation, and pricing logic.
//These are separate responsibilities, so the class has multiple reasons to change. Each responsibility should be moved into its own class.

public class MarkerOps {

    public void saveToDB(Marker marker){
        System.out.println("Save to DB");
    }

    public void printInvoice(Marker marker){
        System.out.println("Print Invoice");
    }

    public void calculateTotal(Marker marker){
        System.out.println("Total markers price: " +  marker.getPrice());

    }

}