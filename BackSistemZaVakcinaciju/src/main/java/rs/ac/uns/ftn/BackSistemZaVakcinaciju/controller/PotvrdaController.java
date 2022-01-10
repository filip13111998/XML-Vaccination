package rs.ac.uns.ftn.BackSistemZaVakcinaciju.controller;

import java.util.ArrayList;

import javax.xml.bind.JAXB;

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
import rs.ac.uns.ftn.BackSistemZaVakcinaciju.service.PotvrdaService;
import rs.ac.uns.ftn.interesovanje.Interesovanje;
import rs.ac.uns.ftn.potvrda.Potvrda;

@RestController
@RequestMapping(value = "potvrda", produces = MediaType.APPLICATION_XML_VALUE, consumes =  MediaType.APPLICATION_XML_VALUE)
public class PotvrdaController {

	
	@Autowired
	private PotvrdaService ps;
	
	@Autowired
	JaxB jaxB;
	
	@PostMapping(value = "/savePotvrda")
	public String saveEmployeeInformation(@RequestBody String p) throws Exception
	{
		System.out.println(p);
		Potvrda po = jaxB.unmarshall(Potvrda.class, p);
		boolean b = ps.savePotvrda(po);
		return "Potvrda saved successfully -- "+p;
	}
	
	@GetMapping(value = "/loadPotvrde/{jmbg}")
	public ArrayList<Potvrda> loadPotvr(@PathVariable("jmbg") String jmbg) throws Exception
	{
		ArrayList<Potvrda> potvrde = ps.loadAllPot(jmbg);
		return potvrde;
	}
	
	@GetMapping(value = "/loadLastPotvrda/{jmbg}")
	public Potvrda loadLastPotvrda(@PathVariable("jmbg") String jmbg) throws Exception
	{
		Potvrda potvrda = ps.loadLastPotvrda(jmbg);
		return potvrda;
	}
	
}
