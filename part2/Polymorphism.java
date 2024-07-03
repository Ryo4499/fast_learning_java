import com.example.Truck;
import com.example.Car;

public class Polymorphism {
    public static void main(String[] args) {
        Car car = new Car("BMW", "Black", 200, 2019);
        car.display();

        Truck truck = new Truck("Volvo", "White", 180, 2018, 1000);
        truck.display();

        car.run();
        car.stop();
        truck.run();
        truck.stop();
    }
}

