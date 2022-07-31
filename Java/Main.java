package Java;

class Main{

    public static void main(String [] args ) {

        System.out.println("Hola Mundop");

        Car car = new Car("AMQ123", new Account("Andrea ",
        "AND125"));
        car.passegenger = 4;
       /// System.out.println("Car License :"+car.license);
        car.printDataCar();

        Car car2 =new Car("AQW789", new Account("Camila",
         "CADE898"));

        car2.passegenger = 6;
       // System.out.println("Car License: "+car2.license);
       car2.printDataCar();
        
    }

}