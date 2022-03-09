package main.java.tasks.homework.basetask;

public class TrainMethodsReturn {

    public long returnNewInt(int intNumber){
        long returnNewIntResult = (long) intNumber * 3;
        return returnNewIntResult;
    }

    public long returnNewLong(long longNumber){
        long returnNewLongResult = longNumber - 4;
        return(returnNewLongResult);
    }

    public String returnNewChar(char CharSymbol){
        String stringSymbol = String.valueOf(CharSymbol);
        String returnNewCharResult = stringSymbol.concat(stringSymbol);
        return(returnNewCharResult);
    }

    public double returnNewFloat(float floatNumber){
        double returnNewFloatResult = (double) floatNumber / 2;
        return returnNewFloatResult;
    }

    public double returnNewDouble(double doubleNumber){
        double returnNewDoubleResult = doubleNumber + 8;
        return returnNewDoubleResult;
    }

    public int returnNewShort(short shortNumber){
        int returnNewShortResult = shortNumber - 1;
        return (returnNewShortResult);
    }

    public short returnNewByte(byte byteNumber){
        short returnNewByteResult = (short) (byteNumber * 2);
        return (returnNewByteResult);
    }

    public boolean returnNewBoolean(boolean myBoolean){
        boolean returnNewBooleanResult = !myBoolean;
        return (returnNewBooleanResult);
    }


}
