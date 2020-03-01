public class Casual extends Customer {
    public Casual(String givenName){
        super(givenName);
        carLimit = 1;
        type = "Casual";
        setRentBehavior(new RentCas());
    }
}
