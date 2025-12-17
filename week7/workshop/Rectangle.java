package week7.workshop;


/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle
{
    float length;
    float breadth;

    void area(){
        System.out.println(length * breadth);
    }


    public static void main(String[] args) {
        Rectangle garden = new Rectangle();
        garden.length = 50;
        garden.breadth = 20;

        Rectangle table = new Rectangle();
        table.length = 3;
        table.breadth = 2;

        System.out.println("Area of garden");
        garden.area();
        System.out.println("Area of table");
        table.area();
    }
}