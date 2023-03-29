public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }
    public void printCTruck(){
        System.out.println("License Plate: "+getLicensePlate());
        System.out.println("Toll Fee: "+getTollFee());
        System.out.println("Passengers: "+getPassengers());
        System.out.println("Axles: "+axles);
        System.out.println("Has trailer: "+hasTrailer);
    }

    public boolean validateLicensePlate(){
        if(hasTrailer&&axles>4){
            if(getLicensePlate().endsWith("MX")){
                return true;
            }
            return false;
        }
        if(hasTrailer&&axles<=4){
            if(getLicensePlate().endsWith("LX")){
                return true;
            }
            return false;
        }
        return true;
    }
}