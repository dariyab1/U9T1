public class VehicleRunner {
    public static void main(String[] args) {
        // -------------- LAB PART 1 -----------------
        // a. write code to create a Vehicle object with license "MC56WQ",
        //    toll fee of 10.75, and 5 passengers.
        //    Print out the calculated toll TollPrice.




        // b. write code to create an electric Car with license "KXN73F",
        //    toll fee of 8.50, and 2 passengers.
        //    Print out the calculated toll price




        // c. add a printCar() void method to the Car class that prints the
        //    Car's license plate, toll fee, number of passengers, whether it is electric,
        //    and whether a discount has been applied.
        //    Add getter methods as necessary to the Vehicle superclass.
        //
        // d. call the method on the Car you made in b to test it.




        // e. write code to create a Truck with license "3K9JMX",
        //    a toll fee of 24.75, 4 passengers, 6 axles, with a trailer.
        //    Print out the calculated toll price




        // f. add a printTruck() void method to the Truck class that prints the
        //    Truck's license plate, toll fee, number of passengers, number of axles,
        //    and whether it has a trailer.
        //    Add getter methods as necessary to the Vehicle superclass.
        //
        // g. call the method on the Truck you made in e to test it.


Taxi myTaxi=new Taxi("8Fh2b9", 9.25, 3, true, 5.0);

        // ------------ LAB PART 2 ---------------
        // ----- instructions in lab sheet -------
        System.out.println("--- Testing method on a Car object ---");
        Car testCar1 = new Car("KXN73F", 8.50, 5, true);
        System.out.println(testCar1.getPassengers());
        System.out.println("-----------");
        boolean success = testCar1.dropOffPassengers(3);
        System.out.println(success);
        System.out.println(testCar1.getPassengers());
        System.out.println("-----------");
        success = testCar1.dropOffPassengers(3);
        System.out.println(success);
        System.out.println(testCar1.getPassengers());
        System.out.println("--- Testing method on a Taxi object ---");
        Taxi testTaxi1 = new Taxi("JMD645", 10.35, 3, false, 5.0);
        System.out.println(testTaxi1.getPassengers());
        System.out.println("-----------");
        success = testTaxi1.dropOffPassengers(3);
        System.out.println(success);
        System.out.println(testTaxi1.getPassengers());
        System.out.println("-----------");
        success = testTaxi1.dropOffPassengers(2);
        System.out.println(success);
        System.out.println(testTaxi1.getPassengers());
        System.out.println("-----------");



        // ------------ LAB PART 3 ---------------
        // ----- instructions in lab sheet -------



    }
}