package main.java.tasks.homework.basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();

        //вызов метода returnNewInt
        long intNumberResult = trainMethodsReturn.returnNewInt(1000000000);
        //c граничным значением на выходе будет long, предусмотрено расшинение типа данных
        System.out.println("метод returnNewInt вернул " + intNumberResult);

        //вызов метода returnNewLong
        long returnNewLongResult = trainMethodsReturn.returnNewLong(10000000000L);
        System.out.println("метод returnNewLong вернул " + returnNewLongResult);

        //вызов метода returnNewChar
        String returnNewCharResult = trainMethodsReturn.returnNewChar('a');
        System.out.println("метод returnNewChar вернул " + returnNewCharResult);

        //вызов метода returnNewFloat
        float floatNumber = 0.0000000000000000000000000000000000000000000014F;
        double returnNewFloatResult = trainMethodsReturn.returnNewFloat(floatNumber);
        //c граничным значением на выходе будет double, предусмотрено расшинение типа данных
        System.out.printf("метод returnNewFloat вернул " + "%.46f%n", returnNewFloatResult);

        //вызов метода returnNewDouble
        double longDoubleNumber = 0.00000000000000000000000000000000000000000000014D;
        double smallDoubleNumber = 0.00000000000001;
        //граничное значение, на котором не округляется дробная часть при переводе суммы из двоичной формы в десятичную
        double returnNewDoubleResult = trainMethodsReturn.returnNewDouble(smallDoubleNumber);
        System.out.println("метод returnNewDouble вернул " + returnNewDoubleResult);
        //System.out.printf("%.47f", longDoubleNumber);

        //вызов метода returnNewShort
        short shortNumber = (-32768);
        int returnNewShortResult = trainMethodsReturn.returnNewShort(shortNumber);
        //c граничным значением -32768 на выходе будет int, предусмотрено расшинение типа данных
        System.out.println("метод returnNewShort вернул " + returnNewShortResult);

        //вызов метода returnNewByte
        byte byteNumber = 127;
        short returnNewByteResult = trainMethodsReturn.returnNewByte(byteNumber);
        //c граничным значением на выходе будет short, предусмотрено расшинение типа данных
        System.out.println("метод returnNewByte вернул " + returnNewByteResult);

        //вызов метода returnNewBoolean
        boolean myBoolean=false;
        boolean returnNewBooleanResult = trainMethodsReturn.returnNewBoolean(myBoolean);
        System.out.println("метод returnNewBoolean получил " + myBoolean + " и вернул " + returnNewBooleanResult);

    }
}

