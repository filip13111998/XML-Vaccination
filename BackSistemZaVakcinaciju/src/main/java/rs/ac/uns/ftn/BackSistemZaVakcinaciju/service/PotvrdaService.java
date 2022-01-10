package rs.ac.uns.ftn.BackSistemZaVakcinaciju.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.ac.uns.ftn.BackSistemZaVakcinaciju.jaxb.JaxB;
import rs.ac.uns.ftn.BackSistemZaVakcinaciju.repository.PotvrdaRepo;
import rs.ac.uns.ftn.myuser.MyUser;
import rs.ac.uns.ftn.potvrda.Potvrda;

@Service
public class PotvrdaService {
	
	
	@Autowired
	private JaxB jaxB;
	
	@Autowired
	private PotvrdaRepo pr;

	@Autowired
	private MyUserService mus;
	
	public boolean savePotvrda(Potvrda p) throws Exception {
		String potvrdaXML = jaxB.marshall(Potvrda.class,p);
		int id = mus.loadAndAddPotvrdaId(p.getJmbg());
		pr.savePotvrda(potvrdaXML,p.getJmbg(),id+"");
		
		return true;
	}

	public ArrayList<Potvrda> loadAllPot(String jmbg) throws Exception {
		ArrayList<Potvrda> potv = new ArrayList<Potvrda>();
		MyUser mu = mus.loadUser(jmbg);
		int id = mus.loadPotvrdaId(mu.getJmbg());
		for(int i = 1 ; i <= id ; i++) {
			String s= pr.loadPotvrda(jmbg, i+"");
			Potvrda pt = jaxB.unmarshall(Potvrda.class, s);
			potv.add(pt);
		}
//		Interesovanje ins = jaxB.unmarshall(Interesovanje.class, s);
		return potv;
	}

	public Potvrda loadLastPotvrda(String jmbg) throws Exception {
		MyUser mu = mus.loadUser(jmbg);
		int id = mus.loadPotvrdaId(mu.getJmbg());
		if(id == 0) {
			return null;
		}
		String s= pr.loadPotvrda(jmbg, id+"");
		Potvrda pt = jaxB.unmarshall(Potvrda.class, s);
		return pt;
	}
	
}
