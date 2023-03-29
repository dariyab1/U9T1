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
        Taxi myTaxi3 = new Taxi("TX1234", 10.0, 6, true, 0.0);
        System.out.println(myTaxi3.getPassengers()); // should be 6, including driver

        Vehicle myVehicle3 = new Vehicle("BB8123", 7.0, 3);
        myVehicle3.printInfo();

        Car myCar3 = new Car("MK4567", 6.75, 4, true);
        myCar3.printInfo();
        Truck myTruck3 = new Truck("TB12MX", 15.50, 2, 4, true);
        myTruck3.printInfo();





        // ------------ LAB PART 3 ---------------
        // ----- instructions in lab sheet -------



    }
}