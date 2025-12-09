package week_3.tutorial;

public class DataTypeExample {

    public static void main(String[] args) {
        System.out.println("INT Min Value: " + Integer.MIN_VALUE);
        System.out.println("INT Max Value: " + Integer.MAX_VALUE);
        System.out.println("INT Bytes: " + Integer.BYTES);
        System.out.println("INT Bits: " + Integer.SIZE);

        System.out.println("Float Min Value: " + Float.MIN_VALUE);
        System.out.println("Float Max Value: " + Float.MAX_VALUE);
        System.out.println("Float Bytes: " + Float.BYTES);
        System.out.println("Float Bits: " + Float.SIZE);

        long i = 2000L;

        float f1 = 2.33f;
        float f2 = (float) 2.33;

        byte b = 127; //works fine because byte's max value is 127
        byte c = 10;

        byte d = (byte) (b + c); // b+c gives int

        float g = 12.33f;
        long v = 200L;
        double j = 200.33;

        int x = (int) (g + v + j);
        System.out.println("Adding float, long and double; type casting to int:" + x);

        int length = 100;
        int breadth = 200;
        int perimeter_rectangle = 2 * (length + breadth);
        int area_rectangle = length * breadth;

        System.out.println("Perimeter: " + perimeter_rectangle + ". Area: " + area_rectangle);

        int principal = 100;
        int time = 5;
        float rate = 2.33f;
        int n = 2; // number of time it is compunded per year

        float SI = (principal * time * rate) / 100;
        float CI = principal * (float) Math.pow((1 + rate / n), time * n);
        System.out.println("SI: " + SI + ". CI: " + CI);

    }
}
