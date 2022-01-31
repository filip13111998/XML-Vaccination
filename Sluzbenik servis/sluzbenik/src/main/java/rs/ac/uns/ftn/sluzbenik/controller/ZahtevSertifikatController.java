package rs.ac.uns.ftn.sluzbenik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.ac.uns.ftn.interesovanje.Interesovanje;
import rs.ac.uns.ftn.sluzbenik.service.SertifikatService;
import rs.ac.uns.ftn.sluzbenik.service.ZahtevService;
import rs.ac.uns.ftn.zahtev.Zahtev;

@RestController
@RequestMapping(value = "zahtev",consumes =  MediaType.APPLICATION_XML_VALUE)
public class ZahtevSertifikatController {

    @Autowired
    private ZahtevService zahtevService;


    @PostMapping
    public ResponseEntity<String> saveZahtev(@RequestBody Zahtev zahtevZaSertifikat) throws Exception
    {
        System.out.println("-=14-o2=3-fl=-wo=d-f=1-3=f12=3fk102kf9240=tgj2=904");
        System.out.println(zahtevZaSertifikat.toString());

        boolean b = zahtevService.saveZahtev(zahtevZaSertifikat);

        if(b){

            System.out.println("Sacuvan!!!!");
            return new ResponseEntity<String>("Sačuvano!",HttpStatus.OK);
        }else{
            System.out.println("Nije sacuvano :( !");
            return new ResponseEntity<String>("Nije uspelo čuvanje!",HttpStatus.BAD_REQUEST);
        }
    }
}
