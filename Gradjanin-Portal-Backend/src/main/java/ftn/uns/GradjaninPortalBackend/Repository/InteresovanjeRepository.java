package ftn.uns.GradjaninPortalBackend.Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.xmldb.api.modules.XMLResource;

import ftn.uns.GradjaninPortalBackend.db.EntityManager;
import ftn.uns.GradjaninPortalBackend.jaxb.JaxB;

import ftn.uns.GradjaninPortalBackend.service.UserService;


@Component
public class InteresovanjeRepository {

	@Autowired
	private JaxB jaxB;

	@Autowired
	private UserService us;

	@Autowired
	private EntityManager entityManager;
	
	public static Integer inter_counter=0;

	public void saveInteresovanje(String text, String jmbg) throws Exception {
		String collectionId = "/db/inter/" + jmbg;
		entityManager.storeFromText(collectionId, (++inter_counter)+"", text);
	}

	public String loadInterovanje(String jmbg, String id) throws Exception {
		String collectionId = "/db/inter/" + jmbg;
		XMLResource res = entityManager.load(collectionId, id);

		String s = (String) res.getContent();

		return s;
	}

	

}
