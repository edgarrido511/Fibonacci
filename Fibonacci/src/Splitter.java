import java.util.ArrayList;
import java.util.List;

public class Splitter {
	
	public void numPar(List<Integer> array){
		System.out.println("Numeros pares: ");
		for(int i=0;i<array.size();i++) {
			if(array.get(i)%2 == 0)
				System.out.print(array.get(i)+ ", " );
		}

	}
	public void numImpar(List<Integer> array){
		System.out.println("\nNumeros impares: ");
		for(int i=0;i<array.size();i++) {
			if(array.get(i)%2 != 0)
				System.out.print(array.get(i)+ ", " );
		}

	}

}
