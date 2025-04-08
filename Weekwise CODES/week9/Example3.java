package week9;
import java.util.Optional;
import java.util.stream.Stream;
public class Example3 {
	public static void main(String[] args) {
		Optional<Double> maxrand =
				Stream.generate(Math::random)
				.limit(100)
				.filter(n -> n < 0.1)
				.max(Double::compareTo);  
	   Optional<Double> maxrandsqr =
				maxrand.map(v -> v*v);//stream of v1,v2: f(v1),f(v2)...
	   System.out.println(maxrandsqr.orElse(-1.0));
	}
}
