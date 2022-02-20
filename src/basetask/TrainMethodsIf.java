package basetask;

public class TrainMethodsIf {

    public int returnNewInt(int inputInt){
        int returnNewIntResult;
        if (inputInt < 8){
            returnNewIntResult = inputInt * 7;
        } else {
            returnNewIntResult = inputInt / 4;
        }
        return returnNewIntResult;
    }

    public long returnNewLong (long inputLong){
        long returnNewLongResult;
        if (inputLong > 300){
            returnNewLongResult = inputLong - 300;
        } else {
            returnNewLongResult = inputLong + 20;
        }
        return returnNewLongResult;
    }

    public String returnNewChar (char inputChar){
        String inputString = String.valueOf(inputChar);
        String returnNewCharResult;
        String condition = "g";
        if (inputString.equals(condition)){
            returnNewCharResult = "go";
        } else {
            String o ="o";
            returnNewCharResult = o.concat(inputString);
        }
        return returnNewCharResult;
    }

    public float returnNewFloat (float inputFloat){
        float returnNewFloatResult;
        if (inputFloat == 0.67F){
            returnNewFloatResult = inputFloat;
        } else {
            returnNewFloatResult = inputFloat * 2;
        }
        return returnNewFloatResult;
    }

    public double returnNewDouble(double inputDouble){
        double returnNewDoubleResult;
        if (inputDouble <= 30){
            returnNewDoubleResult = inputDouble;
        } else{
            if (inputDouble < 80){
                returnNewDoubleResult = inputDouble + 87;
            } else {
                if (inputDouble == 80) {
                    returnNewDoubleResult = inputDouble;
                } else {
                    if (inputDouble < 400){
                        returnNewDoubleResult = inputDouble - 87;
                    } else {
                        if (inputDouble == 400){
                            returnNewDoubleResult = inputDouble;
                        } else {
                            returnNewDoubleResult = inputDouble / 4;
                        }
                    }
                }
            }
        }
        return returnNewDoubleResult;
    }

    public void returnNewBoolean(boolean myBoolean){
        if(myBoolean == true){
            System.out.println( "Я получил на вход значение истины");
        } else{
            System.out.println( "Я получил на вход ложь");
        }
    }


}
