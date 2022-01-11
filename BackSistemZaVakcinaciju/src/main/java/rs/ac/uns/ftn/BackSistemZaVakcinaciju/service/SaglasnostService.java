package rs.ac.uns.ftn.BackSistemZaVakcinaciju.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.ac.uns.ftn.BackSistemZaVakcinaciju.jaxb.JaxB;
import rs.ac.uns.ftn.BackSistemZaVakcinaciju.repository.SaglasnostRepo;
import rs.ac.uns.ftn.obrazac.Obrazac;

@Service
public class SaglasnostService {
	@Autowired
	private JaxB jaxB;
	
	@Autowired
	private SaglasnostRepo sr;

	public boolean saveObrazac(Obrazac ob) throws Exception {
		String saglasnostXML = jaxB.marshall(Obrazac.class,ob);
		sr.saveSaglasnost(saglasnostXML, ob.getDrzavljanstvo().getSrbija().getJmbg());
		return true;
	}

	public Obrazac loadObrazac(String jmbg){
		String s;
		Obrazac obr;
		try {
			s = sr.loadSaglasnost(jmbg);
			obr = jaxB.unmarshall(Obrazac.class, s);
			return obr;
		} catch (Exception e) {
			return null;
		}

	}
}
