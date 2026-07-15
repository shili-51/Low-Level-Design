public class Marker{
    private String brand;
    private String color;
    private int price;

    public Marker(String brand, String color, int price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}