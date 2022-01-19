package rs.ac.uns.ftn.sluzbenik.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.xmldb.api.modules.XMLResource;
import rs.ac.uns.ftn.sluzbenik.db.EntityManager;

@Repository
public class ObrazacRepository {

    private static final String collectionId = "/db/obrazac";

    @Autowired
    private EntityManager entityManager;

    public void saveObrazac(String text,String jmbg,String id) throws Exception {
        String collectionIdJmbg = collectionId + jmbg;
        entityManager.storeFromText(collectionIdJmbg, id, text);
    }

    public String loadObrazac(String jmbg,String id) throws Exception {
        String collectionIdJmbg = collectionId + jmbg;
        XMLResource result = entityManager.load(collectionIdJmbg, id);

        return (String) result.getContent();
    }
}
