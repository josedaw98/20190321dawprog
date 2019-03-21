package examen.ejercicio1;

import java.util.Comparator;

public class ComparadorRellenoPerimetro implements Comparator<Figura> {

	
	@Override
	public int compare(Figura f1, Figura f2) {
		if (f1.getRellenas() && !f2.getRellenas())
			return 1;
		else if (f1.getRellenas() && f2.getRellenas())
			return -1;
		else {
			if(f1.getperimetro()>f2.getperimetro()) {
				return 1;
			}else if(f1.getperimetro()>f2.getperimetro()) {
				return-1;
			}else
				return 0;
		}
	}

}
