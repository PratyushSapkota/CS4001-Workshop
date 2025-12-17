package week7.tutorial;


/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog
{
    String breed;
    int age;
    String color;
    float weight;
    int number_of_teeth;
    
    void bark(){
        System.out.println("Woof");
    }
    void sit(){
        System.out.println("Dog has sat down");
    }
    void eat(){
        System.out.println("Dog has eaten");
    }
    void bite(){
        System.out.println("BITE!");
    }
    
    
    public static void main(String[] args){
        Dog dog1 = new Dog();
        
    }
}