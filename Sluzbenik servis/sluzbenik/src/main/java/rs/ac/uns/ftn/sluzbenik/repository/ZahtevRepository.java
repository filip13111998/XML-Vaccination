package rs.ac.uns.ftn.sluzbenik.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.xmldb.api.modules.XMLResource;
import rs.ac.uns.ftn.sluzbenik.db.EntityManager;

@Repository
public class ZahtevRepository {

    @Autowired
    private EntityManager entityManager;

    public void saveZahtevZaSertifikat(String text,String jmbg,String id) throws Exception {
        String collectionId = "/db/zahtev/"+ jmbg;
        entityManager.storeFromText(collectionId, id, text);
    }

    public String loadZahtevZaSertifikat(String jmbg,String id) throws Exception {
        String collectionId = "/db/zahtev/"+ jmbg;
        XMLResource res = entityManager.load(collectionId, id);

        return (String) res.getContent();
    }
}
