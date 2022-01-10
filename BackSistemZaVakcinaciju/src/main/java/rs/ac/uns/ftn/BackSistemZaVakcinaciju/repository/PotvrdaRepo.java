package rs.ac.uns.ftn.BackSistemZaVakcinaciju.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.xmldb.api.modules.XMLResource;

import rs.ac.uns.ftn.BackSistemZaVakcinaciju.db.EntityManager;

@Repository
public class PotvrdaRepo {
	
	@Autowired
	private EntityManager entityManager;
	
	public void savePotvrda(String text,String jmbg,String id) throws Exception {
		String collectionId = "/db/potvrda/"+ jmbg;
		entityManager.storeFromText(collectionId, id, text);
	}
	
	public String loadPotvrda(String jmbg,String id) throws Exception {
		String collectionId = "/db/potvrda/"+ jmbg;
		XMLResource res = entityManager.load(collectionId, id);

		String s = (String) res.getContent();

		return s;
	}
}
