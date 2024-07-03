import com.example.Animal;
import com.example.Dog;

public class If {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run();
        // Error has occurred
        // dog.walk();
        Animal.walk();
        // Error has occurred
        // Animal.run();
    }
}
