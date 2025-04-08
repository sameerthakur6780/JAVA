package week9;
import java.util.Optional;
public class Example4{
	public static Optional<Double>
	inverse(Double x) {
		if (x == 0) {
		return Optional.empty();
		}else{
		return Optional.of(1 / x);
		}
	}
	public static Optional<Double>
	squareRoot(Double x){
		if (x < 0) {
		return Optional.empty();
		}else{
		return Optional.of(Math.sqrt(x));
		}
	}

	public static void main(String[] args) {
		Double x = 0.0;
		//Optional<Double> result =inverse(x).map(Example4::squareRoot);

		Optional<Double> result =inverse(x).flatMap(Example4::squareRoot);
		System.out.println(result.orElse(-1.0));
}
}