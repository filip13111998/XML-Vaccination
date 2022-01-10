package rs.ac.uns.ftn.BackSistemZaVakcinaciju.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;


import rs.ac.uns.ftn.BackSistemZaVakcinaciju.service.MyUserService;
import rs.ac.uns.ftn.myuser.MyUser;


@RestController
@RequestMapping(value = "user",produces = MediaType.APPLICATION_XML_VALUE, consumes =  MediaType.APPLICATION_XML_VALUE)
public class MyUserController {
	
	@Autowired
	private MyUserService mus;
	
	@PostMapping(value = "/saveUser")
	public String saveMyUser(@RequestBody MyUser mu) throws Exception
	{
	
		System.out.println(mu + "  HAHA");
		boolean b = mus.saveUser(mu);
		// Write code to save in the Database
		System.out.println("Boolean " + b);
		return "user saved successfully -- "+mu;
	}
	
	@GetMapping(value = "/loadUser/{jmbg}")
	public MyUser loadMyUser(@PathVariable("jmbg") String jmbg) throws Exception
	{
//		System.out.println("USO");
//		System.out.println(mu + "  HAHA");
//		boolean b = mus.saveUser(mu);
		// Write code to save in the Database
//		System.out.println("Boolean " + b);
		MyUser s = mus.loadUser(jmbg);
		System.out.println(s.getFname());
		return s;
	}
}
