package week9.tutorial;



public class PetrolCar extends Car{
    
    private float milage;
    
    public PetrolCar(float speed, String brand, String engineType, double price, float milage){
        super(speed, brand, engineType, price);
        this.milage = milage; 
    }
    
    public float getMilage(){
        return this.milage;
    }
}