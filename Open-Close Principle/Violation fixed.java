interface PaymentMethod {
    void pay();
}

class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod) {
        paymentMethod.pay();
    }
}

class Cash implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Paid via Cash");
    }
}

class UPI implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Paid via UPI");
    }
}

class NetBanking implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Paid via NetBanking");
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.processPayment(new Cash());
        processor.processPayment(new UPI());
        processor.processPayment(new NetBanking());
    }
}
