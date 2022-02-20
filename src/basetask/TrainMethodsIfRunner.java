package basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {

        TrainMethodsIf trainMethodsIf = new TrainMethodsIf();

        /*вызов метода returnNewInt:
        принимает на вход целое число (int) и если оно меньше 8, то возвращает это число умноженное на 7,
         в противном случае деленное на 4
        */
        int inputInt = 12;
        int returnNewIntResult = trainMethodsIf.returnNewInt(inputInt);
        System.out.println("метод returnNewInt получил " + inputInt + " и вернул " + returnNewIntResult);

        /*вызов метода returnNewLong:
        принимает на вход целое число (long) и если оно больше 300, то возвращает это число минус 300,
         в противном случае плюс 20
        */
        long inputLong = 200;
        long returnNewLongResult = trainMethodsIf.returnNewLong(inputLong);
        System.out.println("метод returnNewLong получил " + inputLong + " и вернул " + returnNewLongResult);

        /*вызов метода returnNewChar:
        принимает на вход символ (char) и если это 'g', то возвращает строку "go",
         в противном случае строку из этого символа с префиксом "o"
        */
        char inputChar = 'g';
        String returnNewCharResult = trainMethodsIf.returnNewChar(inputChar);
        System.out.println("метод returnNewChar получил " + inputChar + " и вернул " + returnNewCharResult);

        /*вызов метода returnNewFloat:
        принимает на вход дробное число (float) и если оно равно 0.67, то возвращает это число,
         в противном случае число умноженное на 2
        */
        float inputFloat = 0.68F;
        float returnNewFloatResult = trainMethodsIf.returnNewFloat( inputFloat);
        System.out.println("метод returnNewChar получил " + inputFloat + " и вернул " + returnNewFloatResult);

        /*вызов метода returnNewDouble:
         принимает на вход дробное число (double) и если оно больше 30, но меньше 80, то  возвращает это число плюс 87,
          если оно больше 80, но меньше 400, то возвращает это число минус 87,
           а если оно больше 400, то деленное на 4,
            в остальных случаях возвращает само число
            30<a<80 : a+87
            80<a<400 : a-87
            a>400 : a/4
            в др случаях : a
        */
        double inputDouble = 600;
        double returnNewDoubleResult = trainMethodsIf.returnNewDouble(inputDouble);
        System.out.println("метод returnNewDouble получил " + inputDouble + " и вернул " + returnNewDoubleResult);

         /*вызов метода returnNewBoolean:
        принимает на вход булево значение (boolean) и
         если оно true то печатает в консоль "Я получил на вход значение истины",
          в противном случае печатает в консоль "Я получил на вход ложь"
        */
        boolean myBoolean = true;
        trainMethodsIf.returnNewBoolean(myBoolean);
    }


}
