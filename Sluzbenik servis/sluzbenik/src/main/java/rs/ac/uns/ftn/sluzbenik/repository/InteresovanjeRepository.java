package rs.ac.uns.ftn.sluzbenik.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.xmldb.api.modules.XMLResource;
import rs.ac.uns.ftn.sluzbenik.db.EntityManager;

@Repository
public class InteresovanjeRepository {

    @Autowired
    private EntityManager entityManager;

    public void saveInteresovanje(String text, String jmbg, String id) throws Exception {
        String collectionId = "/db/inter/"+ jmbg;
        entityManager.storeFromText(collectionId, id, text);
    }

    public String loadInteresovanje(String jmbg, String id) throws Exception {
        String collectionId = "/db/inter/"+ jmbg;
        XMLResource res = entityManager.load(collectionId, id);

        return (String) res.getContent();
    }

}
