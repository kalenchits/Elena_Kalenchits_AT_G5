package main.java.project.bubbles;

import main.java.tasks.classwork.classWork7.B;

public class Runner {

    public static void main(String[] args) {

        Bottle bottle1 = new Bottle(0.5,0);
        Bottle bottle2 = new Bottle(1,0);
        Bottle bottle3 = new Bottle(1.5,0);
        Bottle bottle4 = new Bottle(0.33, 2);
        Bottle bottle5 = new Bottle(1.5, 5);
        Bottle bottle6 = new Bottle(1.5, 22);

        bottle1.open();
        bottle2.open();
        bottle3.open();
        bottle4.open();
        bottle4.checkIsOpenedBottle();
        //!!! берет температуру из создания объекта воды, а не из созданной бутылки.
        //исправить: создавать бултыки с разными объектами воды








    }
}
