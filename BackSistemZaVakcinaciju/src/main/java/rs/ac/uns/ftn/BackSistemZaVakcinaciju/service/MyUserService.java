package rs.ac.uns.ftn.BackSistemZaVakcinaciju.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.ac.uns.ftn.BackSistemZaVakcinaciju.jaxb.JaxB;
import rs.ac.uns.ftn.BackSistemZaVakcinaciju.repository.MyUserRepository;
import rs.ac.uns.ftn.myuser.MyUser;



@Service
public class MyUserService {

	@Autowired
	private MyUserRepository mur;
	
	@Autowired
	private JaxB jaxB;

	public boolean saveUser(MyUser mu) throws Exception {
		// TODO Auto-generated method stub
//		mu.setBrInt(3);
		String userXML = jaxB.marshall(MyUser.class,mu);
//		System.out.println(userXML);
		mur.saveMyUser(userXML,mu.getJmbg());
		return true;
	}

	public MyUser loadUser(String jmbg) throws Exception {
		// TODO Auto-generated method stub
//		mu.setBrInt(3);
//		String userXML = jaxB.marshall(MyUser.class,mu);
//		System.out.println(userXML);
//		mur.saveMyUser(userXML,mu.getJmbg());
		String ms = mur.loadMyUser(jmbg);
		MyUser unm = jaxB.unmarshall(MyUser.class, ms);
//		unm.setFname("KICA");
		return unm;
	}
	
	
	public int loadInterId(String jmbg) throws Exception {
		MyUser mus = loadUser(jmbg);
		return mus.getBrInt();
		
	}

	public int loadAndAddInterId(String jmbg) throws Exception {
		String ms = mur.loadMyUser(jmbg);		
		MyUser unm = jaxB.unmarshall(MyUser.class, ms);
		unm.setBrInt(unm.getBrInt()+1);
		String newUser = jaxB.marshall(MyUser.class, unm);
		mur.saveMyUser(newUser, jmbg);
		return unm.getBrInt();
		
	}

	
	public int loadPotvrdaId(String jmbg) throws Exception {
		MyUser mus = loadUser(jmbg);
		return mus.getBrPot();
		
	}
	public int loadAndAddPotvrdaId(String jmbg) throws Exception {
		MyUser mus = loadUser(jmbg);
		mus.setBrPot(mus.getBrPot()+1);
		String newUser = jaxB.marshall(MyUser.class, mus);
		mur.saveMyUser(newUser, jmbg);
		return mus.getBrPot();
		
	}
}
