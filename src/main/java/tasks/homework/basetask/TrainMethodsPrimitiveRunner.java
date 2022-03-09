package main.java.tasks.homework.basetask;

public class TrainMethodsPrimitiveRunner {
    public static void main(String[] args) {
        TrainMethodsPrimitive trainMethodsPrimitive = new TrainMethodsPrimitive();
        trainMethodsPrimitive.printInt(2147483647);
        trainMethodsPrimitive.printLong(9999999999L);
        trainMethodsPrimitive.printChar('a');
        trainMethodsPrimitive.printFloat(1.5F);
        trainMethodsPrimitive.printDouble(1.9999999999);
        short a = 1000;
        trainMethodsPrimitive.printShort(a);
        byte b = 5;
        trainMethodsPrimitive.printByte(b);
        trainMethodsPrimitive.printBoolean(true);
    }
}
