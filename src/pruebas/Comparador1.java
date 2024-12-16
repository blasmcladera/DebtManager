package pruebas;

import java.util.Comparator;

public class Comparador1 implements Comparator<MiClase>{

	@Override
	public int compare(MiClase o1, MiClase o2) {
		
		return (int) (o2.getMonto()-o1.getMonto());
	}
	
}