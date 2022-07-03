package rs.ac.uns.ftn.sluzbenik.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.xmldb.api.modules.XMLResource;
import rs.ac.uns.ftn.sluzbenik.db.EntityManager;
import rs.ac.uns.ftn.sluzbenik.jaxb.JaxB;
import rs.ac.uns.ftn.stanje_vakcina.StanjeVakcina;
import rs.ac.uns.ftn.zahtev.Zahtev;

@Repository
public class StanjeVakcinaRepository {

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private JaxB jaxB;

    public void saveStanjeVakcina(String text,String godina) throws Exception {
        String collectionId = "/db/stanje_vakcina/"+ godina;
        entityManager.storeFromText(collectionId, godina, text);
    }

    public String loadStanjeVakcina(String godina) throws Exception {
        String collectionId = "/db/stanje_vakcina/"+ godina;
        XMLResource res = entityManager.load(collectionId, godina);

        return (String) res.getContent();
    }

    public String updateStanjeVakcina(String godina, StanjeVakcina dodataStanja) throws Exception {
        String collectionId = "/db/stanje_vakcina/"+ godina;
        XMLResource res = entityManager.load(collectionId, godina);

        StanjeVakcina stanjeVakcina = jaxB.unmarshall(StanjeVakcina.class,(String) res.getContent());

        stanjeVakcina.setAstraZeneca(stanjeVakcina.getAstraZeneca() + dodataStanja.getAstraZeneca());
        stanjeVakcina.setModerna(stanjeVakcina.getModerna() + dodataStanja.getModerna());
        stanjeVakcina.setSinofarm(stanjeVakcina.getSinofarm() + dodataStanja.getSinofarm());
        stanjeVakcina.setSputnjik(stanjeVakcina.getSputnjik() + dodataStanja.getSputnjik());
        stanjeVakcina.setFajzer(stanjeVakcina.getFajzer() + dodataStanja.getFajzer());

        String stanjeXML = jaxB.marshall(StanjeVakcina.class,stanjeVakcina);

        entityManager.storeFromText(collectionId, godina, stanjeXML);


        return (String) res.getContent();
    }


}
