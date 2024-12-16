package pruebas;

import java.util.Comparator;

public class Comparador2 implements Comparator<MiClase>{

	@Override
	public int compare(MiClase o1, MiClase o2) {
		
		return (int) (o1.getMonto()-o2.getMonto());
	}
	
}
