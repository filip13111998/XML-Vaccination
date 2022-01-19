package rs.ac.uns.ftn.sluzbenik.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.ac.uns.ftn.digitalni_sertifikat.DigitalniSertifikat;
import rs.ac.uns.ftn.myuser.MyUser;
import rs.ac.uns.ftn.potvrda.Potvrda;
import rs.ac.uns.ftn.sluzbenik.jaxb.JaxB;
import rs.ac.uns.ftn.sluzbenik.repository.SertifikatRepository;

import java.util.ArrayList;

@Service
public class SertifikatService {


    @Autowired
    private JaxB jaxB;

    @Autowired
    private SertifikatRepository sertifikatRepository;

    @Autowired
    private MyUserService myUserService;

    public boolean saveSertifikat(Potvrda p) throws Exception {
        String sertifikatXML = jaxB.marshall(Potvrda.class,p);
        int id = myUserService.loadAndAddPotvrdaId(p.getJmbg());
        sertifikatRepository.saveSertifikat(sertifikatXML,p.getJmbg(), Integer.toString(id));

        return true;
    }

    public ArrayList<DigitalniSertifikat> loadAllSertifikat(String jmbg) throws Exception {
        ArrayList<DigitalniSertifikat> sertifikati = new ArrayList<DigitalniSertifikat>();
        MyUser mu = myUserService.loadUser(jmbg);
        int id = myUserService.loadPotvrdaId(mu.getJmbg());
        for(int i = 1 ; i <= id ; i++) {
            String s= sertifikatRepository.loadPotvrda(jmbg, i+"");
            Potvrda pt = jaxB.unmarshall(Potvrda.class, s);
            potv.add(pt);
        }
//		Interesovanje ins = jaxB.unmarshall(Interesovanje.class, s);
        return potv;
    }

    public Potvrda loadLastPotvrda(String jmbg) throws Exception {
        MyUser mu = mus.loadUser(jmbg);
        int id = mus.loadPotvrdaId(mu.getJmbg());
        if(id == 0) {
            return null;
        }
        String s= sertifikatRepository.loadPotvrda(jmbg, id+"");
        Potvrda pt = jaxB.unmarshall(Potvrda.class, s);
        return pt;
    }
}
