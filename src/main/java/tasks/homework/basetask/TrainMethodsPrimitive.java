package main.java.tasks.homework.basetask;

public class TrainMethodsPrimitive {

    public void printInt(int number) {
        System.out.println("я получил на вход число " + number);
    }

    public void printLong(long longNumber) {
        System.out.println("я получил на вход  длинное число " + longNumber);
    }

    public void printChar(char charSymbol) {
        System.out.println("я получил на вход символ " + charSymbol);
    }

    public void printFloat(float floatNumber) {
        System.out.println("я получил на вход дробное число " + floatNumber);
    }

    public void printDouble(double doubleNumber) {
        System.out.println("я получил на вход длинное дробное число " + doubleNumber);
    }

    public void printShort(short shortNumber) {
        System.out.println("я получил на вход короткое число " + (short) (shortNumber));
    }

    public void printByte(byte byteNumber) {
        System.out.println("я получил на вход очень короткое число " + byteNumber);
    }

    public void printBoolean(boolean booleanNumber) {
        System.out.println("я получил на вход булево " + booleanNumber);
    }
}
