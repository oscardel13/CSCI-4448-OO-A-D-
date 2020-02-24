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

    }
}