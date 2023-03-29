public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
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

    @Override
    public double calculateTollPrice(){
        double price=getTollFee()*axles;
        if(hasTrailer){
            price*=2;
        }
        return price;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Number of axles: "+axles);
        System.out.println("Has trailer: "+hasTrailer);
    }
}