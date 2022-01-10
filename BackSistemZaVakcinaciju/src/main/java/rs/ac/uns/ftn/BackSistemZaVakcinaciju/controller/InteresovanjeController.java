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

import rs.ac.uns.ftn.BackSistemZaVakcinaciju.service.InterService;
import rs.ac.uns.ftn.interesovanje.Interesovanje;

@RestController
@RequestMapping(value = "inter", produces = MediaType.APPLICATION_XML_VALUE, consumes =  MediaType.APPLICATION_XML_VALUE)
public class InteresovanjeController {
	@Autowired
	private InterService ins;
	
	@PostMapping(value = "/saveInter")
	public String saveInteresovanje(@RequestBody Interesovanje in) throws Exception
	{
		System.out.println(in + "  HAHA");
		System.out.println(in.getFiksni());
		System.out.println(in.getDrzavljanin().isDrzavljaninSrbije());
		boolean b = ins.saveInter(in);
		
		// Write code to save in the Database
//		System.out.println("Boolean " + b);
		return "Interesovanje saved successfully -- "+in;
	}
	
	@GetMapping(value = "/loadInters/{jmbg}")
	public ArrayList<Interesovanje> loadInteresovanje(@PathVariable("jmbg") String jmbg) throws Exception
	{
//		System.out.println(mu + "  HAHA");
		ArrayList<Interesovanje> ints = ins.loadAllInters(jmbg);
		// Write code to save in the Database
//		System.out.println("Boolean " + b);
		return ints;
	}
}
