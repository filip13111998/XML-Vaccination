package rs.ac.uns.ftn.BackSistemZaVakcinaciju.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rs.ac.uns.ftn.BackSistemZaVakcinaciju.jaxb.JaxB;
import rs.ac.uns.ftn.BackSistemZaVakcinaciju.service.InterService;
import rs.ac.uns.ftn.BackSistemZaVakcinaciju.service.SaglasnostService;
import rs.ac.uns.ftn.interesovanje.Interesovanje;
import rs.ac.uns.ftn.obrazac.Obrazac;

@RestController
@RequestMapping(value = "saglasnost", produces = MediaType.APPLICATION_XML_VALUE, consumes =  MediaType.APPLICATION_XML_VALUE)
public class SaglasnostController {

	
	@Autowired
	private SaglasnostService ss;
	
	@Autowired
	JaxB jaxB;
	
	@PostMapping(value = "/saveSaglasnost")
	public String saveSaglasnost(@RequestBody String ob) throws Exception
	{
		System.out.println(ob + "  HAHA");
		Obrazac obr = jaxB.unmarshall(Obrazac.class, ob);
		boolean b = ss.saveObrazac(obr);
		// Write code to save in the Database
//		System.out.println("Boolean " + b);
		return "Interesovanje saved successfully -- "+ob;
	}
	
	@GetMapping(value = "/loadSaglasnost/{jmbg}")
	public Obrazac loadSaglasnost(@PathVariable("jmbg") String jmbg) throws Exception
	{
//		System.out.println(mu + "  HAHA");
		Obrazac obr = ss.loadObrazac(jmbg);
		// Write code to save in the Database
//		System.out.println("Boolean " + b);
		return obr;
	}
}
