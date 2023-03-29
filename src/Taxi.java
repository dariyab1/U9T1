public class Taxi extends Car{
    private double fareCollected;
    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public void printTaxi(){
        printCar();
        System.out.println("Fare Collected: "+fareCollected);
    }

    public void pickupRiders(int numRiders, double farePerRider){
        addPassenger(numRiders);
        fareCollected+=farePerRider*numRiders;
        if(!(isDiscountApplied())&&getPassengers()>=4){
            setDiscountApplied();
            setTollFee(getTollFee()*.5);
        }
    }
    public double getFareCollected(){
        return fareCollected;
    }

}
