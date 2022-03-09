package main.java.tasks.homework.basetask;

public class TrainMethodsIf {

    public int returnNewInt(int inputInt) {
        int returnNewIntResult;
        if (inputInt < 8) {
            returnNewIntResult = inputInt * 7;
        } else {
            returnNewIntResult = inputInt / 4;
        }
        return returnNewIntResult;
    }

    public long returnNewLong(long inputLong) {
        long returnNewLongResult;
        if (inputLong > 300) {
            returnNewLongResult = inputLong - 300;
        } else {
            returnNewLongResult = inputLong + 20;
        }
        return returnNewLongResult;
    }

    public String returnNewChar(char inputChar) {

        if (inputChar == 'g') {
            return "go";
        } else {
            return "o" + inputChar;
        }
    }

    public float returnNewFloat(float inputFloat) {
        float returnNewFloatResult;
        if (inputFloat == 0.67F) {
            returnNewFloatResult = inputFloat;
        } else {
            returnNewFloatResult = inputFloat * 2;
        }
        return returnNewFloatResult;
    }

    public double returnNewDouble(double inputDouble) {
        double returnNewDoubleResult;
        if (inputDouble > 30 && inputDouble < 80) {
            return inputDouble + 87;
        } else {
            if (inputDouble > 80 && inputDouble < 400) {
                return inputDouble - 87;
            } else {
                if (inputDouble > 400) {
                    return inputDouble / 4;
                } else {
                    return inputDouble;
                }
            }
        }
    }

    public void returnNewBoolean(boolean myBoolean) {
        if (myBoolean) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
    }


}
