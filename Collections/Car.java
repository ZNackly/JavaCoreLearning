public class Car {
    private String Brand;
    private int number;
    Car(String Brand, int number){
        this.Brand = Brand;
        this.number = number;
    }
    public String getBrand(){
        return Brand;
    }
    public int getNumber(){
        return number;
    }
}