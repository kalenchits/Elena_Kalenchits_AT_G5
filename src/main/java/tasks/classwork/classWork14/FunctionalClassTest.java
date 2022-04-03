package main.java.tasks.classwork.classWork14;

import org.junit.Assert;
import org.junit.Test;


public class FunctionalClassTest {

    @Test
    public void generateNewIntTestLess30(){
        FunctionalClass functionalClass = new FunctionalClass();
        int result = functionalClass.generateNewInt(20);
        Assert.assertEquals("Generated int is not +4",24,result);
    }

    @Test
    public void generateNewIntTestMore30(){
        FunctionalClass functionalClass = new FunctionalClass();
        int result = functionalClass.generateNewInt(40);
        Assert.assertEquals("Generated int is not -4",36,result);
    }
}
