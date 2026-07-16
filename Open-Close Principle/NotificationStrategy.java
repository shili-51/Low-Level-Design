// Notification Strategy

interface NotificationChannel{
    void send();
}

class NotificationService{
    public void sendNotification(NotificationChannel channel){
        channel.send();
    }
}

class SMSNotification implements NotificationChannel{
    @Override
    public void send(){
        System.out.println("Sent SMS notification");
    }
}

class WhatsappNotification implements NotificationChannel{
    @Override
    public void send(){
        System.out.println("Sent whatsapp notification");
    }
}

public class Main{
    public static void main(String[] args){
        NotificationService service = new NotificationService();
        service.sendNotification(new SMSNotification());
        service.sendNotification(new WhatsappNotification());
        
    }
}
