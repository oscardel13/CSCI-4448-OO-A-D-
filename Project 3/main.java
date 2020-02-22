public class main {
    public static void main(String[] args) {
        Car car1 = new Luxury("abc123");
        car1 = new GPS(car1);
        System.out.println(car1.getDescription());

    }
}