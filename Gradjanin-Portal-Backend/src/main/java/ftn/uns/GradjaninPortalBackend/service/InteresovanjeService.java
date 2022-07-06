package ftn.uns.GradjaninPortalBackend.service;

import java.util.ArrayList;
import java.util.Optional;

import javax.xml.bind.JAXB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ftn.uns.GradjaninPortalBackend.Repository.InteresovanjeRepository;
import ftn.uns.GradjaninPortalBackend.Repository.UserRepository;
import ftn.uns.GradjaninPortalBackend.fuseki.FusekiWriter;
import ftn.uns.GradjaninPortalBackend.fuseki.MetadataExtractor;
import ftn.uns.GradjaninPortalBackend.jaxb.JaxB;
import ftn.uns.GradjaninPortalBackend.model.interesovanje.Interesovanje;
import ftn.uns.GradjaninPortalBackend.model.user.User;

@Service
public class InteresovanjeService {

	@Autowired
	private JaxB jaxB;

	@Autowired
	private InteresovanjeRepository ir;

	@Autowired
	private UserRepository ur;

	@Autowired
	private MetadataExtractor mex;

	public boolean saveInter(String in) throws Exception {
		
		Interesovanje ins = jaxB.unmarshall(Interesovanje.class, in);

//		Optional<User> u = ur.findByJmbg(ins.getJmbg());

//		String username = u.get().getUsername();

//		String interXML = jaxB.marshall(Interesovanje.class, in);

		
		System.out.println("PROSO");
		
//		System.out.println(in);

		mex.extractMetadata(in);
		
		FusekiWriter.saveRDF();

		ir.saveInteresovanje(in, ins.getJmbg());
		// OVDE POZVATI MEJL SERVER DA POSALJE MEJL KLIJENTU KAD JE VAKCINACIJA I
		// GENERISE RADNOM KOD ZA DALJI TOK
		return true;
	}

	public Interesovanje loadInters(String username, String id) throws Exception {

//		int id = mus.loadInterId(jmbg);
		String jmbg = ur.findByUsername(username).getJmbg();
		String s = ir.loadInterovanje(jmbg, id);
		Interesovanje ins = jaxB.unmarshall(Interesovanje.class, s);
		return ins;
	}

//	public ArrayList<Interesovanje> loadAllInteresovanja(String jmbg) throws Exception {
//
//////		int id = mus.loadInterId(jmbg);
////		ArrayList<Interesovanje> inter = new ArrayList<Interesovanje>();
////		MyUser mu = mus.loadUser(jmbg);
////		int id = mus.loadInterId(mu.getJmbg());
////		for (int i = 1; i <= id; i++) {
////			String s = ir.loadInter(jmbg, i + "");
////			Interesovanje ins = jaxB.unmarshall(Interesovanje.class, s);
////			inter.add(ins);
////		}
//////		Interesovanje ins = jaxB.unmarshall(Interesovanje.class, s);
////		return inter;
//	}

}
