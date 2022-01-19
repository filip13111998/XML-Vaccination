package rs.ac.uns.ftn.sluzbenik.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.xmldb.api.modules.XMLResource;
import rs.ac.uns.ftn.sluzbenik.db.EntityManager;

@Repository
public class MyUserRepository {
    private static final String collectionId = "/db/users";

    @Autowired
    private EntityManager entityManager;

    public void saveMyUser(String text,String jmbg) throws Exception {
        entityManager.storeFromText(collectionId, jmbg, text);
    }

    public String loadMyUser(String jmbg) throws Exception {
        XMLResource res = entityManager.load(collectionId, jmbg);

        return (String) res.getContent();
    }
}
