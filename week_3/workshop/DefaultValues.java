package week_3.workshop;

public class DefaultValues
{
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bo;

    public static void main(String[] args){
        DefaultValues d = new DefaultValues();
        
        System.out.println("Byte "+d.b);
        System.out.println("Short "+d.s);
        System.out.println("Int "+d.i);
        System.out.println("Long "+d.l);
        System.out.println("Float "+d.f);
        System.out.println("Double "+d.d);
        System.out.println("Char "+d.c);
        System.out.println("Boolean "+d.bo);

        /*
         * this wouldn't work for local variable because an 
         * instance variable does not have to be initialized 
         * but local variable has to.
         */
    }
}