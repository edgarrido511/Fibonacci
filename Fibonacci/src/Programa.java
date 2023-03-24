import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		
		List<Integer> array  = new ArrayList<Integer>();
		
		Fibonacci a = new Fibonacci();
		Splitter b = new Splitter();
		Manager c = new Manager();
		a.listaFibonacci(array);
		b.numPar(array);
		b.numImpar(array);
		c.ejecutar();
		
	}

}
