import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Fibonacci {
	
	public void listaFibonacci(List<Integer> array) {
		array.add(1);
		array.add(1);
	
		for(int i = 1; i>0;i++) {
			int valor = array.get(i) + array.get(i-1);
			array.add(valor);
			if (valor >= 1000000)
				break;
		}
		System.out.println(array);
	}

	


}
