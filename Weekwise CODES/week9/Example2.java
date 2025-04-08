package week9;

import java.util.Optional;
import java.util.stream.Stream;

public class Example2 {

    public static void main(String[] args) {
        // Stream to generate random numbers
        Optional<Double> maxrand = Stream.generate(Math::random)
                                        .limit(100)
                                        .filter(n -> n < 0.1)
                                        .max(Double::compareTo);
        //to get value from optional type variables
        Double resultOrElse = maxrand.orElse(0.0);
        System.out.println("Result using orElse: " + resultOrElse);

        // orElseGet(Supplier<? extends T> other)
        Double resultOrElseGet = maxrand.orElseGet(() ->  0.2);
        System.out.println("Result using orElseGet: " + resultOrElseGet);

        // orElseThrow(Supplier<? extends X> exceptionSupplier)
        try {
            Double resultOrElseThrow = maxrand.orElseThrow(() -> new IllegalStateException("No value found"));
            System.out.println("Result using orElseThrow: " + resultOrElseThrow);
        } catch (IllegalStateException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        // ifPresent(Consumer<? super T> consumer)
        maxrand.ifPresent(value -> System.out.println("Result using ifPresent: " + value));

        // ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction)
        maxrand.ifPresentOrElse(
                value -> System.out.println("Result using ifPresentOrElse: " + value),
                () -> System.out.println("No value found")
        );
        
        //create optional values
        // Optional.of(v)
        Optional<Double> ofValue = Optional.of(10.0);
        System.out.println("Value using Optional.of: " + ofValue.orElse(9.0));

        // Optional.empty()
        Optional<Double> emptyOptional = Optional.empty();//it has nothing
        System.out.println("Value using Optional.empty: " + emptyOptional.orElse(0.0));

        // Optional.ofNullable
        Optional<Double> ofNullable = Optional.ofNullable(99.0);//if non null, wrap into an optional //for null it is going to create empty optional
        System.out.println("Value using Optional.ofNullable: " + ofNullable.orElse(1.0));

        // or(Supplier<? extends Optional<? extends T>> supplier)
        Optional<Double> orOptional = Optional.empty();//empty optional
        Optional<Double> resultOr = orOptional.or(() -> Optional.of(5.0));
        System.out.println("Result using or: " + resultOr.orElse(0.0));

        
    }
}
