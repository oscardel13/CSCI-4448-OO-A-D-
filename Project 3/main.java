public class main {
    public static void main(String[] args) {
        Car car1 = new Luxury("abc123");
        car1 = new GPS(car1);
        car1 = new Radio(car1);
        car1 = new CarSeat(car1);
        car1 = new CarSeat(car1);
        System.out.println(car1.getDescription());
        System.out.println(car1.price());
        System.out.println(car1.total());
        System.out.println("THIS IS FOR FUN");
        Customer colin = new Casual("Colin");
        Customer calvin = new Casual("Calvin");
        Customer oscar = new Regular("Oscar");
        Customer mikey = new Business("Mikey");
        System.out.println(colin.name);
        colin.performRent();
        System.out.println(calvin.name);
        calvin.performRent();
        System.out.println(oscar.name);
        oscar.performRent();
        System.out.println(mikey.name);
        mikey.performRent();


    }
}