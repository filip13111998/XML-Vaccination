package rs.ac.uns.ftn.sluzbenik.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.ac.uns.ftn.obrazac.Obrazac;
import rs.ac.uns.ftn.sluzbenik.jaxb.JaxB;
import rs.ac.uns.ftn.sluzbenik.repository.ZahtevRepository;
import rs.ac.uns.ftn.zahtev.Zahtev;

@Service
public class ZahtevService {

    @Autowired
    private JaxB jaxB;

    @Autowired
    private ZahtevRepository zahtevRepository;

    public boolean saveZahtev(Zahtev zahtev) throws Exception {
        String zahtevXML = jaxB.marshall(Zahtev.class,zahtev);
        zahtevRepository.saveZahtevZaSertifikat(zahtevXML, zahtev.getJmbg(), zahtev.getJmbg() );
        return true;
    }

    public Zahtev loadZahtev(String jmbg){
        String zahtevString;
        Zahtev obr;
        try {
            zahtevString = zahtevRepository.loadZahtevZaSertifikat(jmbg,jmbg);
            obr = jaxB.unmarshall(Zahtev.class, zahtevString);
            return obr;
        } catch (Exception e) {
            return null;
        }

    }
}
