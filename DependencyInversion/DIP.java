                MessageService
                (Abstraction)
                /     |      \
               /      |       \
      EmailService  SMSService  WhatsappService
               \      |       /
                \     |      /
             NotificationService


// dependency inversion 
// Abstraction that both the high-level and low-level modules depend on.
interface MessageService{
    void send();
}


// Low Level Modules
class SMSService implements MessageService{
    @Override
    public void send(){
        System.out.println("SMS sent!");
    }
}

class WhatsappService implements MessageService{
    @Override
    public void send(){
        System.out.println("whatsapp text sent!");
    }
}

class EmailService implements MessageService{
    @Override
    public void send(){
        System.out.println("Email sent!");
    }
}



// High Level Module
class NotificationService{
    
    private MessageService service;

  // dependency injected through constructor
    public NotificationService(MessageService service){
        this.service = service;
    }
    
    public void notifyUser(){
        service.send();
    }
}

public class Main{
    public static void main(String[] args){
        NotificationService notificationService1 = new NotificationService(new EmailService());
        notificationService1.notifyUser();
        NotificationService notificationService2 = new NotificationService(new SMSService());
        notificationService2.notifyUser();
        NotificationService notificationService3 = new NotificationService(new WhatsappService());
        notificationService3.notifyUser();
    }
}
