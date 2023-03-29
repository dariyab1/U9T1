public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;

    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }


    public boolean dropOffPassengers(int numOut){
        if(numOut>=getPassengers()){
            return false;
        }
        removePassengers(numOut);
        return true;
    }

    public void applyDiscount(){
        if(!(discountApplied)&&isElectric()){
            discountApplied=true;
            setTollFee(getTollFee()*.5);
        }
    }

    public boolean isElectric(){
        return electric;
    }
    public boolean isDiscountApplied(){
        return discountApplied;
    }
    public void setDiscountApplied(){
        discountApplied=true;
    }
    @Override
    public double calculateTollPrice(){
        if(getPassengers()>4){
            return 4*getTollFee();
        }
        return super.calculateTollPrice();
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Eletric? "+electric);
        System.out.println("Discount applied? "+discountApplied);
    }

}