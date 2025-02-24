package Abstactions;

public class ex_task2_abst {
    public static void main(String[] args) {
        Car_wagorR wagon = new Car_wagorR();
        wagon.driver();
    }
}


class Car_wagorR extends engine{
    @Override
    void start_engine() {
        System.out.println("Start the car");
    }

    @Override
    void stop_engine() {
        System.out.println("stop the Car");

    }

    void driver(){
        start_engine();
        System.out.println("I am driving ");
        stop_engine();
    }
}


abstract  class engine{
    abstract void start_engine();
    abstract void stop_engine();
}
