interface paymentMethod{
    void pay();
}


class paymentProcessor{
    public void payment(paymentMethod payment){
        payment.pay();
    }
}

class Cash implements paymentMethod{
    public void pay(){
        System.out.println("Paid via Cash");
    }
}

class UPI implements paymentMethod{
    public void pay(){
        System.out.println("Paid via UPI");
    }
}

class Netbanking implements paymentMethod{
    public void pay(){
        System.out.println("Paid via Netbanking");
    }
}

// newfeature 
class debitCard implements paymentMethod{
    public void pay(){
        System.out.println("Paid via debitCard");
    }
}



public class Main{
    public static void main(String[] args){
        paymentProcessor processor = new paymentProcessor();
        // processor.payment(new Cash());
        processor.payment(new debitCard());
    }
}
