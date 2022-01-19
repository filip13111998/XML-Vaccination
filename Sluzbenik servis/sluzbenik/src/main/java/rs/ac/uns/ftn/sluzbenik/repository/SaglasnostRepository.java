package rs.ac.uns.ftn.sluzbenik.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.xmldb.api.modules.XMLResource;
import rs.ac.uns.ftn.sluzbenik.db.EntityManager;

@Repository
public class SaglasnostRepository {

    @Autowired
    private EntityManager entityManager;

    public void saveSaglasnost(String text, String jmbg) throws Exception {

        String collectionId = "/db/saglasnost/";
        entityManager.storeFromText(collectionId, jmbg, text);
    }

    public String loadSaglasnost(String jmbg) throws Exception {
        String collectionId = "/db/saglasnost/";
        XMLResource result = entityManager.load(collectionId, jmbg);

        return (String) result.getContent();
    }
}