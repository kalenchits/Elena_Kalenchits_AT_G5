package main.java.tasks.classwork.classWork4;

public class Runner {

    public static void main(String[] args) {

        //создан массив из 4 колес
        Wheel[] wheels = {
                new Wheel(16, "summer"),
                new Wheel(16, "summer"),
                new Wheel(16, "summer"),
                new Wheel(16, "summer")
        };

        //созданы новые объекты
        Car car = new Car("red", 100, "polo", wheels);
        Bike bike = new Bike("green", 25, "Jawa", wheels);
        Boeing boeing = new Boeing("Boeing 747");

        //объекты класса Car могут иметь тип Родительский класс Vehicle или интерфейс Movable
        Vehicle car2 = new Car("red", 100, "polo", wheels);
        Movable car3 = new Car("red", 100, "polo", wheels);


        VehicleProcessor vehicleProcessor = new VehicleProcessor();

        //vehicleProcessor.printInfoVehicle(car);
        //vehicleProcessor.printInfoVehicle(bike);
        //vehicleProcessor.printInfoBoeing(boeing);

        vehicleProcessor.printMachinaryDetails(car);
        vehicleProcessor.printMachinaryDetails(bike);
        vehicleProcessor.printMachinaryDetails(boeing);

        vehicleProcessor.startMovable(car);
        vehicleProcessor.startMovable(bike);
        vehicleProcessor.startMovable(boeing);

        vehicleProcessor.stopMovable(car);
        vehicleProcessor.stopMovable(bike);
        vehicleProcessor.stopMovable(boeing);

        vehicleProcessor.startMovable(
                new Movable() {
            @Override
            public void start() {
                System.out.println("Boat has started");
            }

            @Override
            public void stop() {
                System.out.println("Boat has stopped");

            }
        }
        );


    }
}

