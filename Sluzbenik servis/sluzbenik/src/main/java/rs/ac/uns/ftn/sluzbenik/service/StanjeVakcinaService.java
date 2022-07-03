package rs.ac.uns.ftn.sluzbenik.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.ac.uns.ftn.sluzbenik.jaxb.JaxB;
import rs.ac.uns.ftn.sluzbenik.repository.StanjeVakcinaRepository;
import rs.ac.uns.ftn.sluzbenik.repository.ZahtevRepository;
import rs.ac.uns.ftn.stanje_vakcina.StanjeVakcina;
import rs.ac.uns.ftn.zahtev.Zahtev;

@Service
public class StanjeVakcinaService {

    @Autowired
    private JaxB jaxB;

    @Autowired
    private StanjeVakcinaRepository saveZahtevZaSertifikat;

    public boolean saveStanjeVakcina(StanjeVakcina stanjeVakcina, int godina) throws Exception {
        String stanjeXML = jaxB.marshall(StanjeVakcina.class,stanjeVakcina);
        saveZahtevZaSertifikat.saveStanjeVakcina(stanjeXML, Integer.toString(godina));
        return true;
    }

    public String updateStanjeVakcina(StanjeVakcina stanjeVakcina, int godina) throws Exception {
        return saveZahtevZaSertifikat.updateStanjeVakcina(Integer.toString(godina), stanjeVakcina);
    }

    public StanjeVakcina loadStanje(String godina){
        String stanjeString;
        StanjeVakcina stanjeVakcina;
        try {
            stanjeString = saveZahtevZaSertifikat.loadStanjeVakcina(godina);
            stanjeVakcina = jaxB.unmarshall(StanjeVakcina.class, stanjeString);
            return stanjeVakcina;
        } catch (Exception e) {
            return null;
        }

    }
}
