package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Comercial;
import entities.Especializado;
import entities.Residencial;
import entities.Telefone;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Telefone> t = new ArrayList<>();
		
		t.add(new Residencial("Bernardo Matuchewski", "Rua das Palmeiras", sdf.parse("28/10/2015"), "4732659874", false));
		
		t.add(new Comercial("XPTO Ltda", "Duque de Caxias", sdf.parse("21/04/2018"), "1112457896", sdf.parse("01/01/2017"), "Serviços"));
		
		t.add(new Comercial("Sinero Ltda", "Antônio da Veiga", sdf.parse("21/04/2016"), "4178451236", sdf.parse("01/01/2017"), "Comércio"));
		
		t.add(new Especializado("Maria Antonina", "Garcia", sdf.parse("12/12/2012"), "1236251478", 10315));
		
		t.add(new Especializado("Seu Madruga", "Velha", sdf.parse("13/05/2019"), "1573614896", 10));
		
		t.add(new Especializado("Chiquinha", "Itoupavazinha", sdf.parse("07/13/2017"), "2634589710", 7340));
		
		for(Telefone tele : t) {
			System.out.println("========================================");
			System.out.println(tele);
		}
		
	}

}
