public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("red", 19999.85, 'M'); // Output: "Car (red) - P19999.85 - medium"
        System.out.println(car1.toString());
        Car car2 = new Car("blue", 50000.00, 'L');// Output: "Car (blue) - P50000.00 - large"
        System.out.println(car2.toString());
    }
}