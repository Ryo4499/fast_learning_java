import com.example.Car;
import com.example.pack.Ship;
import com.example.pack.Vessel;

public class AccessModifier {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "blue", 200, 2021);
        car.display();
        System.out.println(car.getName());
        System.out.println(car.getColor());
        System.out.println(car.getMaxSpeed());
        System.out.println(car.getYear());
        Ship ship = new Ship("boat", "red", 100, 2021);
        System.out.println(ship.name);
        // Error: name has private access in Ship
        // System.out.println(ship.color);
        // System.out.println(ship.maxSpeed);
        // System.out.println(ship.year);
        System.out.println(ship.getName());
        // Error: getName() has private access in Ship
        // System.out.println(ship.getColor());
        // System.out.println(ship.getMaxSpeed());
        // System.out.println(ship.getYear());
        System.out.println("=====================================");
        Vessel vessel = new Vessel("Titanic", "White", 100, 1912);
        System.out.println(vessel.ship.name);
        // Error: name has private access in Ship
        // System.out.println(vessel.ship.color);
        // System.out.println(vessel.ship.maxSpeed);
        // System.out.println(vessel.ship.year);
        System.out.println(vessel.ship.getName());
        // Error: getName() has private access in Ship
        // System.out.println(vessel.ship.getColor());
        // System.out.println(vessel.ship.getMaxSpeed());
        // System.out.println(vessel.ship.getYear());
    }
}
