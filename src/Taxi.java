public class Taxi extends Car{
    private double fareCollected;
    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
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

    public boolean chargeAndDropOffRiders(double farePerRider){
        fareCollected+=farePerRider*(getPassengers()-1);
        return dropOffPassengers(getPassengers()-1);
    }


    @Override
    //company covers 25% of the cost of gas
    public double gasPrice(double pricePerGallon, int gallons){
        return super.gasPrice(pricePerGallon, gallons)*.75;
    }

}
