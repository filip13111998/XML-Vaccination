package rs.ac.uns.ftn.BackSistemZaVakcinaciju.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.xmldb.api.modules.XMLResource;

import rs.ac.uns.ftn.BackSistemZaVakcinaciju.db.EntityManager;

@Repository
public class SaglasnostRepo {

	@Autowired
	private EntityManager entityManager;
	
	public void saveSaglasnost(String text,String jmbg) throws Exception {
		String collectionId = "/db/saglasnost/";
		entityManager.storeFromText(collectionId, jmbg, text);
	}
	
	public String loadSaglasnost(String jmbg) throws Exception {
		String collectionId = "/db/saglasnost/";
		XMLResource res = entityManager.load(collectionId, jmbg);

		String s = (String) res.getContent();

		return s;
	}
}
