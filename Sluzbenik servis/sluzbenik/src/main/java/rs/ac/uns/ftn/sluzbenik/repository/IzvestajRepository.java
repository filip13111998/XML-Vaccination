package rs.ac.uns.ftn.sluzbenik.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.xmldb.api.modules.XMLResource;
import rs.ac.uns.ftn.sluzbenik.db.EntityManager;

@Repository
public class IzvestajRepository {
    @Autowired
    private EntityManager entityManager;

    public void saveIzvestaj(String text,String jmbg,String id) throws Exception {
        String collectionId = "/db/izvestaj/"+ jmbg;
        entityManager.storeFromText(collectionId, id, text);
    }

    public String loadIzvestaj(String jmbg,String id) throws Exception {
        String collectionId = "/db/izvestaj/"+ jmbg;
        XMLResource result = entityManager.load(collectionId, id);

        return (String) result.getContent();
    }

}
