package week7.tutorial;

public class Car
{
    int modelNumber;
    String brand;
    double price;

    void start(){
        System.out.println("Car start");   
    }

    void stop(){
        System.out.println("Car stop");
    }
    
    
    public static void main(String[] args){
        Car c1 = new Car();
        c1.modelNumber = 1;
        c1.brand = "victoor on wheels";
        c1.price = 67676767;
        
        c1.start();
        
    }
    
}
