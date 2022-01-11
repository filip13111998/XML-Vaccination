package rs.ac.uns.ftn.BackSistemZaVakcinaciju.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.ac.uns.ftn.BackSistemZaVakcinaciju.jaxb.JaxB;
import rs.ac.uns.ftn.BackSistemZaVakcinaciju.repository.InterRepo;
import rs.ac.uns.ftn.BackSistemZaVakcinaciju.repository.PotvrdaRepo;
import rs.ac.uns.ftn.interesovanje.Interesovanje;
import rs.ac.uns.ftn.myuser.MyUser;

@Service
public class InterService {
	
	
	@Autowired
	private JaxB jaxB;
	
	@Autowired
	private InterRepo ir;
	
	@Autowired
	private MyUserService mus;
	
	public boolean saveInter(Interesovanje in) throws Exception {

		String userXML = jaxB.marshall(Interesovanje.class,in);
		System.out.println(userXML);
		int id = mus.loadAndAddInterId(in.getJmbg());
		ir.saveInter(userXML,in.getJmbg(),id+"");
		//OVDE POZVATI MEJL SERVER DA POSALJE MEJL KLIJENTU KAD JE VAKCINACIJA I GENERISE RADNOM KOD ZA DALJI TOK
		return true;
	}

	public Interesovanje loadInter(String jmbg,String id) throws Exception {

//		int id = mus.loadInterId(jmbg);
		String s= ir.loadInter(jmbg, id) ;
		Interesovanje ins = jaxB.unmarshall(Interesovanje.class, s);
		return ins;
	}
	
	public ArrayList<Interesovanje> loadAllInters(String jmbg) throws Exception {

//		int id = mus.loadInterId(jmbg);
		ArrayList<Interesovanje> inter = new ArrayList<Interesovanje>();
		MyUser mu = mus.loadUser(jmbg);
		int id = mus.loadInterId(mu.getJmbg());
		for(int i = 4 ; i <= id ; i++) {
			String s= ir.loadInter(jmbg, i+"");
			Interesovanje ins = jaxB.unmarshall(Interesovanje.class, s);
			inter.add(ins);
		}
//		Interesovanje ins = jaxB.unmarshall(Interesovanje.class, s);
		return inter;
	}
	
}
