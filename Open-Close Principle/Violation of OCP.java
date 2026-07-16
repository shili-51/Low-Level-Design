class Payment{
    public void paymentMethod(String payment){
        if(payment.equals("Cash")){
            System.out.println("Paid via Cash");
        }
        else if(payment.equals("UPI")){
            System.out.println("Paid via UPI");
        }
        if(payment.equals("Netbanking")){
            System.out.println("Paid via Netbanking");
        }
    }
    
}

public class Main{
    public static void main(String[] args){
        Payment payment = new Payment();
        payment.paymentMethod("UPI");
    }
}
