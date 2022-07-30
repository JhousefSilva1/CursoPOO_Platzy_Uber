package Java;

class Main{

    public static void main(String [] args ) {

        System.out.println("Hola Mundop");

        Car car = new Car();
        car.license = "AMQ123";
        car.driver = "Andrea";
        car.passegenger = 4;
       /// System.out.println("Car License :"+car.license);
        car.printDataCar();

        Car car2 =new Car();
        car2.license = "QWS6565";
        car2.driver = "carla";
        car2.passegenger = 6;
       // System.out.println("Car License: "+car2.license);
       car2.printDataCar();
        
    }

}