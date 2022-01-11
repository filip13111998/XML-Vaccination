package rs.ac.uns.ftn.BackSistemZaVakcinaciju.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.xmldb.api.modules.XMLResource;

import rs.ac.uns.ftn.BackSistemZaVakcinaciju.db.EntityManager;

@Repository
public class MyUserRepository {
	private String collectionId = "/db/myUser";
	@Autowired
	private EntityManager entityManager;
	
	public void saveMyUser(String text,String jmbg) throws Exception {
		entityManager.storeFromText(collectionId, jmbg, text);
	}
	
	public String loadMyUser(String jmbg) throws Exception {
		XMLResource res = entityManager.load(collectionId, jmbg);
//		System.out.println("HAHA");
//		System.out.println(res.toString());
		String s = (String) res.getContent();
//		System.out.println(s);
//		MyUser ms = (MyUser)res.getContent();
//		String myUs = res.toString();
		return s;
	}
}
