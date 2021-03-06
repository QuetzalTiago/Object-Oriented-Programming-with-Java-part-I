
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    public boolean larger(Apartment otherApartment){
        if (this.squareMeters>otherApartment.squareMeters){
            return true;
        }else { return false;}
    }
    public int price() {
    return (this.squareMeters*this.pricePerSquareMeter);
}
    public int priceDifference (Apartment otherApartment){
        if (this.price()>otherApartment.price()){
        return (this.price()-otherApartment.price());
        }else {
            return (otherApartment.price()-this.price());
        }
    //return (this.squareMeters*this.pricePerSquareMeter)  //old shit
            //-(otherApartment.squareMeters*otherApartment.pricePerSquareMeter);    
    }
    public boolean moreExpensiveThan(Apartment otherApartment){
        if (this.price()>otherApartment.price()){
            return true;
        }else{
            return false;}
    }
    
    
}
