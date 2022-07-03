package rs.ac.uns.ftn.sluzbenik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.ac.uns.ftn.sluzbenik.jaxb.JaxB;
import rs.ac.uns.ftn.sluzbenik.service.StanjeVakcinaService;
import rs.ac.uns.ftn.stanje_vakcina.StanjeVakcina;

@RestController
@RequestMapping(value = "stanje")
public class StanjeVakcinaController {

    @Autowired
    private JaxB jaxB;

    @Autowired
    private StanjeVakcinaService stanjeVakcinaService;

    @GetMapping(produces = MediaType.APPLICATION_XML_VALUE, value = "/{godina}")
    public ResponseEntity<StanjeVakcina> getStanjeVakcina(@PathVariable int godina) {
        StanjeVakcina stanje = stanjeVakcinaService.loadStanje(Integer.toString(godina));
        if(stanje != null){
            return new ResponseEntity<StanjeVakcina>(stanje, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<StanjeVakcina>(new StanjeVakcina(), HttpStatus.NOT_FOUND);
        }
    }
}
