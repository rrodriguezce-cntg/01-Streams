import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleFunction;


public class Streams_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Factura> facturas = Arrays.asList(
				new Factura("Cliente 1", 1),
				new Factura("Cliente 2", 2),
				new Factura("Cliente 3", 3),
				new Factura("Cliente 4", 4),
				new Factura("Cliente 5", 5)
				);

		//		facturas.stream().mapToDouble(new ToDoubleFunction<Factura>() {
		//			@Override
		//			public double applyAsDouble(Factura value) {
		//				// TODO Auto-generated method stub
		//				return 0;
		//			}
		//		});

		//Streams
		facturas.stream().mapToDouble(f -> f.getCantidad());
		facturas.stream().mapToDouble((Factura f) -> f.getCantidad());
		facturas.stream().mapToDouble(f -> f.getCantidad()).filter(d -> d > 2).forEach(s -> System.out.println(s));//System.out::println	

		
		System.out.println("\n");
		
		
		//Streams en paralelo
		facturas.parallelStream().mapToDouble(f -> f.getCantidad()).filter(d -> d > 2).forEach(s -> System.out.println(s));


	}

}
