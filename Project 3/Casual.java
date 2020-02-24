public class Casual extends Customer {
    public Casual(String givenName){
        super(givenName);
        setRentBehavior(new RentCas());
    }
}
