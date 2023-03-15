import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        //анонимный класс
        Integer integer = 5;
        Predicate<Integer> isNumberPositive = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 0;
            }
        };
        //лямбда
        Predicate<Integer> isNumberPositive1 = integer1 -> integer > 0;

        //Задание 2
        //анонимный класс
        Consumer<String> nameConsumer = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println("Hello " + name);
            }
        };

        //лямбда
        Consumer<String> nameConsumer1 = name -> System.out.println("Hello " + name);

        //Задание 3
        //анонимный класс
        Function<Double, Long> doubleLongFunction = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return aDouble.longValue();
            }
        };

        //лямбда
        Function<Double, Long> doubleLongFunction1 = Double -> Double.longValue();

        //Задание 4
        //анонимный класс
        Random random = new Random();
        Supplier<Integer> randomIntegerSupplier = new Supplier<Integer>() {

            @Override
            public Integer get() {
                return random.nextInt(100);
            }
        };

        //лямбда
        Supplier<Integer> randomIntegerSupplier1 = () -> random.nextInt(100);
    }
}