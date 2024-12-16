package pruebas;

import java.util.ArrayList;
import java.util.List;
public class PruebaLogica1{
	
public static void main(String[] args) {
	
	List<MiClase> verde = new ArrayList<MiClase>();
	List<MiClase> ve = new ArrayList<MiClase>();
	List<MiClase> roja = new ArrayList<MiClase>();
	List<MiClase> ro = new ArrayList<MiClase>();
	List<String> result = new ArrayList<String>();
	Comparador1 c1 = new Comparador1();
	Comparador2 c2 = new Comparador2();
	
	verde.add(new MiClase("A",50));
	verde.add(new MiClase("B",33));
	verde.add(new MiClase("C",78));
	verde.add(new MiClase("D",20));
	verde.add(new MiClase("E",100));
	verde.add(new MiClase("F",41));
	
	roja.add(new MiClase("G", 10));
	roja.add(new MiClase("H", 25));
	roja.add(new MiClase("I", 30));
	roja.add(new MiClase("J", 40));
	roja.add(new MiClase("K", 15));
	roja.add(new MiClase("L", 50));
	roja.add(new MiClase("M", 42));
	roja.add(new MiClase("N", 20));
	roja.add(new MiClase("O", 45));
	roja.add(new MiClase("P", 45));
	
	verde.sort(c1);
	roja.sort(c2);
	
	ve.addAll(verde);
	ro.addAll(roja);
	
	MiClase m = null;
	while (!ve.isEmpty()) {
		roja.clear();
		roja.addAll(ro);
		verde.clear();
		verde.addAll(ve);
		m = verde.getFirst();
		for (MiClase r : roja) {
			if (r.getMonto()<m.getMonto()) {
				result.add(r.getNombre()+" debe "+r.getMonto()+" a "+m.getNombre());
				m.setMonto(m.getMonto()-r.getMonto());
				ve.sort(c2);
				ro.remove(r);
			}
			else if (r.getMonto()>m.getMonto()){
				result.add(r.getNombre()+" debe "+m.getMonto()+" a "+m.getNombre());
				r.setMonto(r.getMonto()-m.getMonto());
				ro.sort(c1);
				ve.remove(m);
				break;
			}
			else {
				result.add(r.getNombre()+" debe "+r.getMonto()+" a "+m.getNombre());
				ro.remove(r);
				ve.remove(m);
				break;
			}
		}
	}
	
	for (String r : result) {
		System.out.println(r.toString());
	}
	System.out.println();
	result.sort(new ComparadorStrings());
	for (String r : result) {
		System.out.println(r.toString());
	}
	
	}
	


}
